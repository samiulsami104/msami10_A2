public class AssignmentTwo {
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Visitor visitor = new Visitor("Alice Johnson", "789 Maple St", 35, "E001", "Ride Operator");

        // Displaying Employee details using getter methods
        System.out.println("Visitor Details:");
        System.out.println("Full Name: " + visitor.getFullName());
        System.out.println("Home Address: " + visitor.getHomeAddress());
        System.out.println("Years Old: " + visitor.getYearsOld());
        System.out.println("Employee ID: " + visitor.getTicketNumber());
        System.out.println("Role: " + visitor.getVisitDate());
    }
}

