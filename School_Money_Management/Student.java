package School_Money_Management;

public class Student {
    //variables
    private int id;
    private String name;
    private double feesToPay;
    private double feesPaid;
    private int grade;
    //constructor
    public Student(int id, String name, int grade) {
        this.id=id;
        this.name=name;
        this.grade=grade;
        feesToPay=1200.90;
        feesPaid=0;
    }
    //graduate grade method
    public void graduate() {
        grade++;
    }
    //setter methods
    public void setGrade(int newGrade) {
        grade=newGrade;
    }
    public void updateFeesToPay(double feesPaid) {
        this.feesToPay-=feesPaid;
    }
    public void updateFeesPaid(double feesPaid) {
        this.feesPaid+=feesPaid;
    }
    //identify student method
    public void idStudent() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Grade: "+grade);
    }
    //getter methods
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getFeesToPay() {
        return this.feesToPay;
    }
    public double getFeesPaid() {
        return this.feesPaid;
    }
    public int getGrade() {
        return this.grade;
    }
}
