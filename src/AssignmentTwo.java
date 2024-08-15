public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        // Example code for Part 3
        Employee operator = new Employee("Alice Johnson", "789 Maple St", 35, "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("rollerCoaster", 2, operator);

        Visitor visitor1 = new Visitor("Jack", "123 Main St", 25, "T001", "2024-08-15");
        Visitor visitor2 = new Visitor("Sharon", "456 Elm St", 22, "T002", "2024-08-15");
        Visitor visitor3 = new Visitor("Benny", "789 Maple St", 28, "T003", "2024-08-15");
        Visitor visitor4 = new Visitor("Leo", "321 Oak St", 30, "T004", "2024-08-15");

        rollerCoaster.AddVisitorToQueue(visitor1);
        rollerCoaster.AddVisitorToQueue(visitor2);
        rollerCoaster.AddVisitorToQueue(visitor3);
        rollerCoaster.AddVisitorToQueue(visitor4);

        rollerCoaster.PrintQueue();
    }

    public void partFourA() {
        // Example code for Part 4A
        Employee operator = new Employee("Bob Smith", "789 Maple St", 40, "E002", "Ride Operator");
        Ride thunderstorm = new Ride("thunderstorm", 4, operator);

        Visitor visitor1 = new Visitor("Tom", "123 Main St", 25, "T005", "2024-08-15");
        Visitor visitor2 = new Visitor("Sherly", "456 Elm St", 22, "T006", "2024-08-15");
        Visitor visitor3 = new Visitor("Ben", "789 Maple St", 28, "T007", "2024-08-15");
        Visitor visitor4 = new Visitor("David", "321 Oak St", 30, "T008", "2024-08-15");

        thunderstorm.AddVisitorToQueue(visitor1);
        thunderstorm.AddVisitorToQueue(visitor2);
        thunderstorm.AddVisitorToQueue(visitor3);
        thunderstorm.AddVisitorToQueue(visitor4);

        thunderstorm.RunOneCycle();
        thunderstorm.PrintRideHistory();
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

