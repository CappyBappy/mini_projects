package Email_Manager;

public class Main {
    public static void main(String[] args) {
        Email cat = new Email("Catherine", "Larson");
        cat.setFirstName("Bob");
        System.out.println(cat.getAddressName());
    }
}
