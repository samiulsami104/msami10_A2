public class Visitor extends Person {
    private String ticketNumber;  //  unique identifier
    private String visitDate;

    // Default constructor (no arguments)
    public Visitor() {
        super();  // Calls the default constructor of Person
    }

    // Parameterized constructor that sets both Visitor and Person instance variables
    public Visitor(String FullName, String HomeAddress, int YearsOld, String ticketNumber, String visitDate) {
        super(FullName, HomeAddress, YearsOld);
        this.ticketNumber = ticketNumber;        // Sets the Visitor-specific instance variable
        this.visitDate = visitDate;              // Sets the Visitor-specific instance variable
    }

    // Getter for ticketNumber
    public String getTicketNumber() {
        return ticketNumber;
    }

    // Setter for ticketNumber
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    // Getter for visitDate
    public String getVisitDate() {
        return visitDate;
    }

    // Setter for visitDate
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }


}
