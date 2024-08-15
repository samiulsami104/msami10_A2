public class Employee extends Person {
    private String EmployeeId;  // Employee-specific attribute unique identifier
    private String Role;

    // Default constructor
    public Employee() {
        super();  // Calls the default constructor of the Person class
    }

    // Parameterized constructor that sets both Employee and Person instance variables
    public Employee(String FullName, String HomeAddress, int YearsOld, String EmployeeId, String Role) {
        super(FullName, HomeAddress, YearsOld);  // Calls the parameterized constructor of the Person class
        this.EmployeeId = EmployeeId;  // Sets the Employee-specific instance variable
        this.Role = Role;              // Sets the Employee-specific instance variable
    }

    // Getter for EmployeeId
    public String getEmployeeId() {
        return EmployeeId;
    }

    // Setter for EmployeeId
    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    // Getter for Role
    public String getRole() {
        return Role;
    }

    // Setter for Role
    public void setRole(String Role) {
        this.Role = Role;
    }
}
