public class Person {

    protected String firstName;
    protected String lastName;
    protected String partner;
    protected int age;
    protected boolean isMarried;

    protected String previousLastName;

    public Person(String firstName, String lastName, String partner, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.partner = partner;
        this.age = age;
        this.isMarried = isMarried;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    // Troubles here

    public String getPreviousLastName() {
        return lastName;
    }

    public void setPreviousLastName(String lastName) {
        this.previousLastName = lastName;
    }
}
