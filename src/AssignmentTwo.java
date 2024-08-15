public class AssignmentTwo {public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        // Execute each part of the assignment
        assignment.partThree();   // Part 3 - Queue Interface

    }

    public void partThree() {
        // Create a new Ride object
        Employee operator = new Employee("Alice Johnson", "789 Maple St", 35, "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("RollerCoaster", 2, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Jack", "123 Main St", 25, "T001", "2024-08-15");
        Visitor visitor2 = new Visitor("Sharon", "456 Elm St", 22, "T002", "2024-08-15");
        Visitor visitor3 = new Visitor("Benny", "789 Maple St", 28, "T003", "2024-08-15");
        Visitor visitor4 = new Visitor("Leo", "321 Oak St", 30, "T004", "2024-08-15");
        Visitor visitor5 = new Visitor("Chris", "654 Pine St", 27, "T005", "2024-08-15");

        // Add Visitors to the queue
        rollerCoaster.AddVisitorToQueue(visitor1);
        rollerCoaster.AddVisitorToQueue(visitor2);
        rollerCoaster.AddVisitorToQueue(visitor3);
        rollerCoaster.AddVisitorToQueue(visitor4);
        rollerCoaster.AddVisitorToQueue(visitor5);

        // Print all Visitors in the queue
        rollerCoaster.PrintQueue();

        // Remove a Visitor from the queue
        rollerCoaster.RemoveVisitorFromQueue(visitor3);

        // Print the queue again to verify the removal
        rollerCoaster.PrintQueue();
    }
    }

    public void partFourA() {
        // Implementation for Part 4A
    }

    public void partFourB() {
        // Implementation for Part 4B
    }

    public void partFive() {
        // Implementation for Part 5
    }

    public void partSix() {
        // Implementation for Part 6
    }

    public void partSeven() {
        // Implementation for Part 7
    }
}




