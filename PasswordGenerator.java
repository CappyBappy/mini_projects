import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String password;
    String[] allChars ={"1","2", "3", "4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","!","@","#","$","%","&","*"};
    String[] capsLetters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] specialChars={"!","@","#","$","%","&","*"};
    String[] numbers={"1","2", "3", "4","5","6","7","8","9"};
    public static void main(String[] args) {
        PasswordGenerator pass = new PasswordGenerator();
        pass.generatePassword();
        System.out.println(pass.password);
    }
    public PasswordGenerator() {

    }
    public void generatePassword() {
        boolean passNotChosen=true;
        while(passNotChosen) {
        System.out.println("Hello, and thank you for using this program. Please indicate the type of password you wish to generate.");
        System.out.println("1. Standard random password.");
        System.out.println("2. Password containing at least one capital letter.");
        System.out.println("3. Password containing at least one special character.");
        System.out.println("4. Password containing at leat one number.");
        System.out.println("5. Password containing one of each of these.");
        int passChoice = scanner.nextInt();
        switch (passChoice) {
            case 1:
                System.out.println("You have chosen to generate a Standard Random Password. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int stand = scanner.nextInt();
                if(stand==2) {
                break;}
                else {
                    passNotChosen=false;
                    boolean numNotChosen = true;
                    while(numNotChosen) {
                    System.out.println("Please input how many characters you would like for this password to be.");
                    int charNum=scanner.nextInt(); 
                    System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int charChoice=scanner.nextInt();
                    if(charChoice==2) {}
                    else{
                        numNotChosen=false;
                    
                    }
                    
                }
            }break;
        
            default:
                break;
        }

    }
   }
}
