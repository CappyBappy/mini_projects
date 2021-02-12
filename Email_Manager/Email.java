package Email_Manager;
import java.util.Random;
public class Email {
    private String addressName;
    private String department;
     String password;
    private int mailboxCapacity;
    private String firstName;
    private String lastName;
    private String company;
    //constructor
    public Email(String firstName, String lastName, String company, String department) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.department=department;
        addressName=firstName+"."+lastName+"@"+department+"."+company+".com";
        mailboxCapacity=50;
        password=generatePassword();
    }
    //generate password
    public String generatePassword() {
        String[] passwordChars= new String[9];
        for(int i=0; i<passwordChars.length;i++) {
            Random random = new Random();
            int character=random.nextInt(26);
            switch (character) {
                case 0:
                    passwordChars[i]="a";
                    break;
                    case 1:
                    passwordChars[i]="b";
                    break;
                    case 2:
                    passwordChars[i]="c";
                    break;
                    case 3:
                    passwordChars[i]="d";
                    break;
                    case 4:
                    passwordChars[i]="e";
                    break;
                    case 5:
                    passwordChars[i]="f";
                    break;
                    case 6:
                    passwordChars[i]="g";
                    break;
                    case 7:
                    passwordChars[i]="h";
                    break;
                    case 8:
                    passwordChars[i]="i";
                    break;
                    case 9:
                    passwordChars[i]="j";
                    break;
                    case 10:
                    passwordChars[i]="k";
                    break;
                    case 11:
                    passwordChars[i]="l";
                    break;
                    case 12:
                    passwordChars[i]="m";
                    break;
                    case 13:
                    passwordChars[i]="n";
                    break;
                    case 14:
                    passwordChars[i]="o";
                    break;
                    case 15:
                    passwordChars[i]="p";
                    break;
                    case 16:
                    passwordChars[i]="q";
                    break;
                    case 17:
                    passwordChars[i]="r";
                    break;
                    case 18:
                    passwordChars[i]="s";
                    break;
                    case 19:
                    passwordChars[i]="t";
                    break;
                    case 20:
                    passwordChars[i]="u";
                    break;
                    case 21:
                    passwordChars[i]="v";
                    break;
                    case 22:
                    passwordChars[i]="w";
                    break;
                    case 23:
                    passwordChars[i]="x";
                    break;
                    case 24:
                    passwordChars[i]="y";
                    break;
                    case 25:
                    passwordChars[i]="z";
                    break;
                default:
                    passwordChars[i]="z";
                    break;
            }
            int upper=random.nextInt(100);
            if(upper>50) {
                passwordChars[i].toUpperCase();
            }
        }
        String randomPassword= passwordChars[0]+passwordChars[1]+passwordChars[2]+passwordChars[3]+passwordChars[4]+passwordChars[5]+passwordChars[6]+passwordChars[7]+passwordChars[8];
        return randomPassword;
    }
}
