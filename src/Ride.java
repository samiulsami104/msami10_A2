public class Ride {
    private String rideName;  // Name of the ride
    private int capacity;     // Maximum number of visitors per ride cycle
    private Employee operator;  // The Employee responsible for operating the ride

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.capacity = 0;
        this.operator = null;  // No operator assigned, ride is closed
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
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

    // Method to assign an Employee to operate the ride
    public void assignOperator(Employee operator) {
        this.operator = operator;
        if (operator != null) {
            System.out.println(operator.getFullName() + " is now operating the " + rideName + ".");
        } else {
            System.out.println("No operator assigned. The ride is currently closed.");
        }
    }
}

