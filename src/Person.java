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
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getYearsOld() {
        return YearsOld;
    }

    public void setYearsOld(int YearsOld) {
        this.YearsOld = YearsOld;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }


}
