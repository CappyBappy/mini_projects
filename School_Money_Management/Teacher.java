package School_Money_Management;

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private String subject;
    boolean isEmployed;
//constructor
    public Teacher(int id, String name, String subject, double salary) {
        this.id=id;
        this.name=name;
        this.subject=subject;
        this.salary=salary;
        this.isEmployed=true;
    }
//getter methods
public int getId() {
    return this.id;
}
public double getSalary() {
    return this.salary;
}
public String getName() {
    return this.name;
}
public String getSubject() {
    return this.subject;
}
public boolean getEmployed() {
    return this.isEmployed;
}
//setter methods
public void setSalary(double salary) {
    this.salary=salary;
}
public void setSubject(String subject) {
    this.subject=subject;
}
public void setEmployed(boolean isEmployed) {
    this.isEmployed=isEmployed;
}

}
