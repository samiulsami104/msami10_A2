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

    // Getters and Setters (same as before)

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

    // Existing methods like RunOneCycle() and PrintRideHistory() remain unchanged
}
