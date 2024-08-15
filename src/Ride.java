import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.capacity = 0;
        this.operator = null;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and Setters
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

    // Implementing methods from RideInterface

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

    @Override
    public void RunOneCycle() {
        if (operator == null) {
            System.out.println("The ride cannot run because it is closed (no operator assigned).");
            return;
        }

        System.out.println("Running " + rideName + " for a full cycle.");

        int count = 0;
        while (!waitingLine.isEmpty() && count < capacity) {
            Visitor visitor = waitingLine.poll();
            rideHistory.add(visitor); // Add visitor to rideHistory
            System.out.println(visitor.getFullName() + " is taking the " + rideName + ".");
            count++;
        }

        if (count == 0) {
            System.out.println("No visitors were in the queue for " + rideName + ".");
        }
    }

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

    // New methods for managing the ride history (LinkedList)
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

    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
        System.out.println("The ride history has been sorted.");
    }
}




