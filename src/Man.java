public class Man extends Person{
    private String previousLastName;
    boolean isRetired = true;
    private String partner;
    private boolean toPreviousLastName;

    public Man(String firstName, String lastName, String partner, int age, boolean isMarried) {
        super(firstName, lastName, partner, age, isMarried);
    }

    public void isRetired() {
        if(age>=65) {
            System.out.println(isRetired);
        }
        else {
            System.out.println("Did not reach 60 yet");
        }
    }

    public void registerPartner() {
        this.partner = getPartner();
        this.lastName = getLastName();
        this.isMarried = true;
        System.out.println("After marriage partner is: " + this.partner + ", Last name: " + this.lastName + ", Is married: " + this.isMarried);
    }

    public void deregisterPartner(boolean toPreviousLastName) {
        this.partner = null;
        this.toPreviousLastName = toPreviousLastName;
        this.isMarried = false;
        System.out.println("After divorce partner is: " + this.partner + ", Previous last name: " + this.toPreviousLastName + ", Is married: " + this.isMarried + ", Last name: " + this.lastName);
    }
}
