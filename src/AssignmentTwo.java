import java.util.Comparator;

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
        Employee operator = new Employee("Alice Johnson", "789 Maple St", 35, "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("RollerCoaster", 2, operator, 2);

        Visitor visitor1 = new Visitor("Jack", "123 Main St", 25, "T001", "2024-08-15");
        Visitor visitor2 = new Visitor("Sharon", "456 Elm St", 22, "T002", "2024-08-15");
        Visitor visitor3 = new Visitor("Benny", "789 Maple St", 28, "T003", "2024-08-15");
        Visitor visitor4 = new Visitor("Leo", "321 Oak St", 30, "T004", "2024-08-15");
        Visitor visitor5 = new Visitor("Chris", "654 Pine St", 27, "T005", "2024-08-15");

        rollerCoaster.AddVisitorToQueue(visitor1);
        rollerCoaster.AddVisitorToQueue(visitor2);
        rollerCoaster.AddVisitorToQueue(visitor3);
        rollerCoaster.AddVisitorToQueue(visitor4);
        rollerCoaster.AddVisitorToQueue(visitor5);

        rollerCoaster.PrintQueue();
        rollerCoaster.RemoveVisitorFromQueue(visitor3);
        rollerCoaster.PrintQueue();
    }

    public void partFourA() {
        Employee operator = new Employee("Bob Smith", "789 Maple St", 40, "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", 4, operator, 2);

        Visitor visitor1 = new Visitor("Tom", "123 Main St", 25, "T005", "2024-08-15");
        Visitor visitor2 = new Visitor("Sherly", "456 Elm St", 22, "T006", "2024-08-15");
        Visitor visitor3 = new Visitor("Ben", "789 Maple St", 28, "T007", "2024-08-15");
        Visitor visitor4 = new Visitor("David", "321 Oak St", 30, "T008", "2024-08-15");
        Visitor visitor5 = new Visitor("Alice", "654 Pine St", 27, "T009", "2024-08-15");

        thunderstorm.addVisitorToCollection(visitor1);
        thunderstorm.addVisitorToCollection(visitor2);
        thunderstorm.addVisitorToCollection(visitor3);
        thunderstorm.addVisitorToCollection(visitor4);
        thunderstorm.addVisitorToCollection(visitor5);

        thunderstorm.isVisitorInCollection(visitor3);
        thunderstorm.isVisitorInCollection(new Visitor("Unknown", "000 Unknown St", 0, "T000", "2024-08-15"));

        thunderstorm.getNumberOfVisitorsInCollection();
        thunderstorm.PrintRideHistory();
    }

    public void partFourB() {
        Employee operator = new Employee("Bob Smith", "789 Maple St", 40, "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", 4, operator, 2);

        Visitor visitor1 = new Visitor("Tom", "123 Main St", 25, "T005", "2024-08-15");
        Visitor visitor2 = new Visitor("Sherly", "456 Elm St", 22, "T006", "2024-08-15");
        Visitor visitor3 = new Visitor("Ben", "789 Maple St", 28, "T007", "2024-08-15");
        Visitor visitor4 = new Visitor("David", "321 Oak St", 30, "T008", "2024-08-15");
        Visitor visitor5 = new Visitor("Alice", "654 Pine St", 27, "T009", "2024-08-15");

        thunderstorm.addVisitorToCollection(visitor1);
        thunderstorm.addVisitorToCollection(visitor2);
        thunderstorm.addVisitorToCollection(visitor3);
        thunderstorm.addVisitorToCollection(visitor4);
        thunderstorm.addVisitorToCollection(visitor5);

        System.out.println("Visitors in the collection before sorting:");
        thunderstorm.PrintRideHistory();

        Comparator<Visitor> comparator = new VisitorComparator();
        thunderstorm.sortRideHistory(comparator);

        System.out.println("Visitors in the collection after sorting:");
        thunderstorm.PrintRideHistory();
    }

    public void partFive() {
        Employee operator = new Employee("Sara Connor", "789 Maple St", 35, "E003", "Ride Operator");
        Ride ferrisWheel = new Ride("FerrisWheel", 10, operator, 3);

        Visitor visitor1 = new Visitor("John", "123 Main St", 25, "T010", "2024-08-16");
        Visitor visitor2 = new Visitor("Sarah", "456 Elm St", 22, "T011", "2024-08-16");
        Visitor visitor3 = new Visitor("Ben", "789 Maple St", 28, "T012", "2024-08-16");
        Visitor visitor4 = new Visitor("David", "321 Oak St", 30, "T013", "2024-08-16");
        Visitor visitor5 = new Visitor("Alice", "654 Pine St", 27, "T014", "2024-08-16");
        Visitor visitor6 = new Visitor("Bob", "123 Maple St", 29, "T015", "2024-08-16");
        Visitor visitor7 = new Visitor("Clara", "789 Oak St", 31, "T016", "2024-08-16");
        Visitor visitor8 = new Visitor("Eve", "456 Pine St", 26, "T017", "2024-08-16");
        Visitor visitor9 = new Visitor("Daniel", "321 Maple St", 32, "T018", "2024-08-16");
        Visitor visitor10 = new Visitor("Frank", "123 Oak St", 30, "T019", "2024-08-16");

        ferrisWheel.AddVisitorToQueue(visitor1);
        ferrisWheel.AddVisitorToQueue(visitor2);
        ferrisWheel.AddVisitorToQueue(visitor3);
        ferrisWheel.AddVisitorToQueue(visitor4);
        ferrisWheel.AddVisitorToQueue(visitor5);
        ferrisWheel.AddVisitorToQueue(visitor6);
        ferrisWheel.AddVisitorToQueue(visitor7);
        ferrisWheel.AddVisitorToQueue(visitor8);
        ferrisWheel.AddVisitorToQueue(visitor9);
        ferrisWheel.AddVisitorToQueue(visitor10);

        System.out.println("Queue before running the cycle:");
        ferrisWheel.PrintQueue();

        ferrisWheel.RunOneCycle();

        System.out.println("Queue after running one cycle:");
        ferrisWheel.PrintQueue();

        System.out.println("Visitors who have taken the ride:");
        ferrisWheel.PrintRideHistory();
    }

    public void partSix() {
        Employee operator = new Employee("Michael Scott", "123 Paper St", 45, "E004", "Ride Operator");
        Ride rollerCoaster = new Ride("RollerCoaster", 5, operator, 3);

        Visitor visitor1 = new Visitor("Jim", "123 Main St", 25, "T020", "2024-08-17");
        Visitor visitor2 = new Visitor("Pam", "456 Elm St", 22, "T021", "2024-08-17");
        Visitor visitor3 = new Visitor("Dwight", "789 Maple St", 28, "T022", "2024-08-17");
        Visitor visitor4 = new Visitor("Stanley", "321 Oak St", 30, "T023", "2024-08-17");
        Visitor visitor5 = new Visitor("Ryan", "654 Pine St", 27, "T024", "2024-08-17");

        rollerCoaster.addVisitorToCollection(visitor1);
        rollerCoaster.addVisitorToCollection(visitor2);
        rollerCoaster.addVisitorToCollection(visitor3);
        rollerCoaster.addVisitorToCollection(visitor4);
        rollerCoaster.addVisitorToCollection(visitor5);

        rollerCoaster.writeVisitorsToFile("ride_history.csv");
    }

    public void partSeven() {
        Ride rollerCoaster = new Ride();

        rollerCoaster.readVisitorsFromFile("ride_history.csv");

        System.out.println("Visitors who have taken the ride (restored from file):");
        rollerCoaster.PrintRideHistory();
    }
}







