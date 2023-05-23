public class Woman extends Person{

    private String previousLastName;

    private boolean toPreviousLastName;

    private boolean isRetired = true;

    public Woman(String firstName, String lastName, String partner, int age, boolean isMarried) {
        super(firstName, lastName, partner, age, isMarried);
    }

    // Version 1

    public void isRetired() {
        if(age>=60) {
            System.out.println(isRetired);
        }
        else {
            System.out.println("Did not reach 60 yet");
        }
    }

    public void registerPartner(Man man) {
        this.partner = getPartner();
        this.setLastName(man.getLastName());
        this.isMarried = true;
        System.out.println("After marriage partner is: " + this.partner + ", Last name: " + this.lastName + ", Is married: " + this.isMarried);
    }

    public void deregisterPartner(boolean toPreviousLastName, Woman woman) {
        this.partner = null;
        this.toPreviousLastName = toPreviousLastName;
        this.isMarried = false;
        this.setPreviousLastName(woman.lastName);
        System.out.println("After divorce partner is: " + this.partner + ", Previous last name: " + this.toPreviousLastName + ", Is married: " + this.isMarried + ", Last name:" + this.getPreviousLastName());
    }
}
