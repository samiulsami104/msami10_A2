public class AssignmentTwo {
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Employee emp = new Employee("Alice Johnson", "789 Maple St", 35, "E001", "Ride Operator");

        // Displaying Employee details using getter methods
        System.out.println("Employee Details:");
        System.out.println("Full Name: " + emp.getFullName());
        System.out.println("Home Address: " + emp.getHomeAddress());
        System.out.println("Years Old: " + emp.getYearsOld());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Role: " + emp.getRole());
    }
}

