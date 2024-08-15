import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;    // The name of the ride
    private int capacity;       // Maximum number of visitors per ride cycle
    private Employee operator;  // The operator assigned to run the ride
    private int maxRider;       // Maximum number of visitors that can take the ride in one cycle
    private int numOfCycles;    // Number of times the ride has been run

    private Queue<Visitor> waitingLine;       // Queue of visitors waiting to take the ride
    private LinkedList<Visitor> rideHistory;  // LinkedList to store visitors who have taken the ride

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.capacity = 0;
        this.operator = null;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
    }

    // Getters and Setters for ride properties
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    // Part 3: Managing the Queue

    @Override
    public void AddVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getFullName() + " added to the queue for " + rideName + ".");
    }

    @Override
    public void RemoveVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println(visitor.getFullName() + " removed from the queue for " + rideName + ".");
        } else {
            System.out.println(visitor.getFullName() + " is not in the queue for " + rideName + ".");
        }
    }

    @Override
    public void PrintQueue() {
        System.out.println("Current queue for " + rideName + ":");
        if (waitingLine.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            for (Visitor visitor : waitingLine) {
                System.out.println("Visitor: " + visitor.getFullName() + ", Age: " + visitor.getYearsOld() + ", Address: " + visitor.getHomeAddress());
            }
        }
    }

    // Part 5: Running the Ride in Cycles

    @Override
    public void RunOneCycle() {
        if (operator == null) {
            System.out.println("The ride cannot run because it is closed (no operator assigned).");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("The ride cannot run because there are no visitors in the queue.");
            return;
        }

        System.out.println("Running " + rideName + " for a full cycle.");
        int count = 0;
        while (!waitingLine.isEmpty() && count < maxRider) {
            Visitor visitor = waitingLine.poll(); // Remove the visitor from the queue
            rideHistory.add(visitor);            // Add the visitor to the ride history
            System.out.println(visitor.getFullName() + " is taking the " + rideName + ".");
            count++;
        }

        numOfCycles++; // Increment the number of cycles
    }

    // Part 4A: Managing the Ride History (LinkedList)

    @Override
    public void PrintRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride yet.");
        } else {
            Iterator<Visitor> iterator = rideHistory.iterator();
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println("Visitor: " + visitor.getFullName() + ", Age: " + visitor.getYearsOld() + ", Address: " + visitor.getHomeAddress());
            }
        }
    }

    public void addVisitorToCollection(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getFullName() + " has been added to the ride history.");
    }

    public boolean isVisitorInCollection(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        if (found) {
            System.out.println(visitor.getFullName() + " is in the ride history.");
        } else {
            System.out.println(visitor.getFullName() + " is not in the ride history.");
        }
        return found;
    }

    public int getNumberOfVisitorsInCollection() {
        int size = rideHistory.size();
        System.out.println("Number of visitors in the ride history: " + size);
        return size;
    }

    // Part 4B: Sorting the Ride History

    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
        System.out.println("The ride history has been sorted.");
    }

    // Part 6: Writing Visitors to a File

    public void writeVisitorsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getFullName() + "," + visitor.getHomeAddress() + "," + visitor.getYearsOld() + "," +
                        visitor.getTicketNumber() + "," + visitor.getVisitDate());
                writer.newLine();
            }
            System.out.println("Visitors have been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Part 7: Reading Visitors from a File

    public void readVisitorsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Visitor visitor = new Visitor(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
                rideHistory.add(visitor); // Restore visitor to the ride history
            }
            System.out.println("Visitors have been successfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}





