public abstract class Person {
    private String FullName;
    private String HomeAddress;
    private int YearsOld;

    public Person() {
    }

    public Person(String FullName, String HomeAddress, int YearsOld) {
        this.FullName = FullName;
        this.HomeAddress = HomeAddress;
        this.YearsOld = YearsOld;
    }

    public String getFullName() {
        return FullName;

    }


}
