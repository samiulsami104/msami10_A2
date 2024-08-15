import java.util.LinkedList;
import java.util.Queue;

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
        if (operator == null) {
            System.out.println("The ride is currently closed. No visitors can be added to the queue.");
        } else {
            waitingLine.add(visitor);
            System.out.println(visitor.getFullName() + " added to the queue for " + rideName + ".");
        }
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
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getFullName());
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
            rideHistory.add(visitor);
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
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getFullName());
        }
    }
}