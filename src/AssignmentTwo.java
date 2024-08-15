import java.util.Comparator;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        // Execute each part of the assignment
        assignment.partThree();   // Part 3 - Queue Interface
        assignment.partFourA();   // Part 4A - Collection class (LinkedList)
        assignment.partFourB();   // Part 4B - Sorting the collection
        assignment.partFive();    // Part 5 - Run a ride cycle
        assignment.partSix();     // Part 6 - Writing to a file
        assignment.partSeven();   // Part 7 - Reading from a file
    }

    public void partThree() {
        // Implementation for Part 3
    }

    public void partFourA() {
        // Implementation for Part 4A
    }

    public void partFourB() {
        // Create a new Ride object
        Employee operator = new Employee("Bob Smith", "789 Maple St", 40, "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", 4, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Tom", "123 Main St", 25, "T005", "2024-08-15");
        Visitor visitor2 = new Visitor("Sherly", "456 Elm St", 22, "T006", "2024-08-15");
        Visitor visitor3 = new Visitor("Ben", "789 Maple St", 28, "T007", "2024-08-15");
        Visitor visitor4 = new Visitor("David", "321 Oak St", 30, "T008", "2024-08-15");
        Visitor visitor5 = new Visitor("Alice", "654 Pine St", 27, "T009", "2024-08-15");

        // Add Visitors to the ride history collection
        thunderstorm.addVisitorToCollection(visitor1);
        thunderstorm.addVisitorToCollection(visitor2);
        thunderstorm.addVisitorToCollection(visitor3);
        thunderstorm.addVisitorToCollection(visitor4);
        thunderstorm.addVisitorToCollection(visitor5);

        // Print all Visitors in the collection (before sorting)
        System.out.println("Visitors in the collection before sorting:");
        thunderstorm.PrintRideHistory();

        // Sort the collection using VisitorComparator
        Comparator<Visitor> comparator = new VisitorComparator();
        thunderstorm.sortRideHistory(comparator);

        // Print all Visitors in the collection (after sorting)
        System.out.println("Visitors in the collection after sorting:");
        thunderstorm.PrintRideHistory();
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






