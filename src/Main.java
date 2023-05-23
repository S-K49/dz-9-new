public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Person name", "Person surname", "Partner", 20, false);
        Man man = new Man ("Man name", "Man's surname", "Woman", 65, false);
        Woman woman = new Woman("Woman name", "Woman's surname", "Man", 60, false);

        Man2 man2 = new Man2 ("Man2 name", "Man's 2 surname", "Woman 2", 64, false);
        Woman2 woman2 = new Woman2("Woman2 name", "Woman's 2 surname", "Man 2", 59, false);

       // Version 1
        System.out.println("Version 1:" + "\n================================================");

       woman.isRetired();
       man.isRetired();

       woman.registerPartner(man);
       man.registerPartner();

       woman.deregisterPartner(true, woman); // cannot print the previous lastName, it returns Man's lastName
       man.deregisterPartner(false);

        //Version 2 - What chatbot suggested:
        System.out.println("\nVersion 2:" + "\n================================================");

        woman.isRetired(); //My method
        man.isRetired(); // My method

        woman2.registerPartnership(man2);
        man2.registerPartnership(man2);

        woman2.deregisterPartnership(true, woman2);
        man2.deregisterPartnership(false, man2);
    }
}
