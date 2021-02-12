package Email_Manager;

public class Main {
    public static void main(String[] args) {
        Email cat = new Email("Catherine", "Larson", "company", "department");
        System.out.println(cat.password);
        Email bob = new Email("Catherine", "Larson", "company", "department");
        System.out.println(bob.password);
        Email fred = new Email("Catherine", "Larson", "company", "department");
        System.out.println(fred.password);
    }
}
