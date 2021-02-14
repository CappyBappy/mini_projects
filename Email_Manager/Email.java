package Email_Manager;
import java.util.Random;
import java.util.Scanner;
public class Email {
    private String addressName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String firstName;
    private String lastName;
    //constructor
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Hello "+firstName+" "+lastName+"! You've just created a new email.");
        mailboxCapacity=50;
        askDept();
        this.password=generatePassword();
        System.out.println("Your randomly generated password is "+ this.password);
        addressName=generateEmail();
        System.out.println("Your email is "+addressName);
    }
    //getters
    public String getAddressName() {
        return this.addressName;
    }
    public String getDepartment() {
        return this.department;
    }
    public String getPassword() {
        return this.password;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getName() {
        return firstName+" "+lastName;
    }
    //setters
    public void setDepartment(String department) {
        this.department=department;
        this.addressName=generateEmail();
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
        this.addressName=generateEmail();
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
        this.addressName=generateEmail();
    }
    //generate email method
    public String generateEmail() {
        return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+".mycompany.com";
    }
    //ask for department
    public void askDept() {
        boolean setDept=true;
        while(setDept) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter in department");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        int deptType = scanner.nextInt();
        switch (deptType) {
            case 1:
                System.out.println("You have selected Sales. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice= scanner.nextInt();
                if(choice==1) {
                    setDept=false;
                    this.department= "Sales";
                    
                }
                break;
            case 2:
            System.out.println("You have selected Development. Is this correct?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choicey= scanner.nextInt();
            if(choicey==1) {
                setDept=false;
                this.department= "Development";
                
            } 
                break;

            case 3:
            System.out.println("You have selected Accounting. Is this correct?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choicet= scanner.nextInt();
            if(choicet==1) {
                setDept=false;
                this.department= "Accounting";}               
      
                break;
            default:
                System.out.println("Invalid option. Please try again.");
            
                break;
        }

    }
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
                    if(random.nextInt(100)>49) {
                    passwordChars[i]="A";
                    }
                    break;
                    case 1:
                    passwordChars[i]="b";
                    if(random.nextInt(100)>49) {
                    passwordChars[i]="B";
                    }
                    break;
                    case 2:
                    passwordChars[i]="c";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="C";
                        }
                    break;
                    case 3:
                    passwordChars[i]="d";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="D";
                        }
                    break;
                    case 4:
                    passwordChars[i]="e";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="E";
                        }
                    break;
                    case 5:
                    passwordChars[i]="f";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="F";
                        }
                    break;
                    case 6:
                    passwordChars[i]="g";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="G";
                        }
                    break;
                    case 7:
                    passwordChars[i]="h";
                    if(random.nextInt(100)>49) {
                    passwordChars[i]="H";
                    }
                    break;
                    case 8:
                    passwordChars[i]="i";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="I";
                        }
                    break;
                    case 9:
                    passwordChars[i]="j";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="J";
                        }
                    break;
                    case 10:
                    passwordChars[i]="k";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="K";
                        }
                    break;
                    case 11:
                    passwordChars[i]="l";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="L";
                        }
                    break;
                    case 12:
                    passwordChars[i]="m";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="M";
                        }
                    break;
                    case 13:
                    passwordChars[i]="n";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="N";
                        }
                    break;
                    case 14:
                    passwordChars[i]="o";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="O";
                        }
                    break;
                    case 15:
                    passwordChars[i]="p";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="P";
                        }
                    break;
                    case 16:
                    passwordChars[i]="q";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="Q";
                        }
                    break;
                    case 17:
                    passwordChars[i]="r";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="R";
                        }
                    break;
                    case 18:
                    passwordChars[i]="s";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="S";
                        }
                    break;
                    case 19:
                    passwordChars[i]="t";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="T";
                        }
                    break;
                    case 20:
                    passwordChars[i]="u";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="U";
                        }
                    break;
                    case 21:
                    passwordChars[i]="v";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="V";
                        }
                    break;
                    case 22:
                    passwordChars[i]="w";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="W";
                        }
                    break;
                    case 23:
                    passwordChars[i]="x";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="X";
                        }
                    break;
                    case 24:
                    passwordChars[i]="y";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="Y";
                        }
                    break;
                    case 25:
                    passwordChars[i]="z";
                    if(random.nextInt(100)>49) {
                        passwordChars[i]="Z";
                        }
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
