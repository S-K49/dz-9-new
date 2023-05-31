public class Woman extends Person{

    private String previousLastName;
    private boolean returnPreviousLastName;

    private boolean isRetired = true;

    /*public Woman(String firstName, String lastName, int age, boolean isMarried, Man partner) {
        super(firstName, lastName, age, isMarried);
        this.previousLastName = lastName;
        this.setPartner(partner);
        this.getPartner().setPartner(this.partner);
    }*/

   public Woman(String firstName, String lastName, int age, boolean isMarried) {
        super(firstName, lastName, age, isMarried);
        this.previousLastName = lastName;
    }

    public String getPreviousLastName() {
        return lastName;
    }

    public void setPreviousLastName(String lastName) {
        this.previousLastName = lastName;
    }

    // Version 1
    @Override
    public boolean isRetired() {
        if(age>=60) {
            System.out.printf("%s is retired\n", getFirstName());
            return true;
        }
        else {
            System.out.printf("%s did not reach 60 yet\n", getFirstName());
            return false;
        }
    }

    @Override
    public void registerPartnership(Person partner) {
        setPartner(partner);
        getPartner().setPartner(this);
        this.setLastName(partner.getLastName());
        this.isMarried = true;
        System.out.println("After marriage partner is: " + this.partner + ", Last name: " + this.lastName + ", Is married: " + this.isMarried);
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        this.partner = null;
        this.isMarried = false;
        if (returnToPreviousLastName) {
            this.setPreviousLastName(lastName);
            System.out.println("After divorce partner is: " + this.partner + ", Previous last name: " + this.previousLastName + ", Is married: " + this.isMarried);
        }
    }
}
