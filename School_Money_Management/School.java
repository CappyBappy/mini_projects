package School_Money_Management;
import java.util.ArrayList;
public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.totalMoneyEarned=0;
        this.totalMoneySpent=0;
        this.teachers=teachers;
        this.students=students;
    }
    //add student method
    public void addStudent(int id, String name, int grade) {
        Student student= new Student(id, name, grade);
        students.add(student);
    }
    //add teacher method
    public void addTeacher(int id, String name, String subject, double salary) {
        Teacher teacher= new Teacher(id, name, subject, salary);
        teachers.add(teacher);
        }
    //add OBJECTS of them
    public void addStudentObject(Student student) {
        this.students.add(student);
    }
    public void addTeacherObject(Teacher teacher) {
        this.teachers.add(teacher);
    }
    //subtract student (subtract sounds weird like I'm planning on assassinating them but that's not what I mean)
    public void unenrollStudent(Student student) {
        int i = students.indexOf(student);
        students.remove(i);
    }
    //fire teacher lol
    public void fireTeacher(Teacher teacher) {
        int i = teachers.indexOf(teacher);
        teachers.remove(i);
    }
    //getters
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }
    //setters
    public void updateTotalMoneyEarned(double moneyEarned) {
        this.totalMoneyEarned+=moneyEarned;
    }
    public void updateTotalMoneySpent(double moneySpent) {
        this.totalMoneySpent+=moneySpent;
        this.totalMoneyEarned-=moneySpent;
    }
    //pay teachers yay
    public void payTeacher(Teacher teacher) {
        this.totalMoneySpent+=teacher.getSalary();
        this.totalMoneyEarned-=teacher.getSalary();
    }
    //students pay tuition
    public void studentsPay(Student student, double feesPaying) {
        this.totalMoneyEarned+=feesPaying;
        student.updateFeesPaid(feesPaying);
        student.updateFeesToPay(feesPaying);
    }
        //graduate grade method
        public void graduate(Student student) {
            int grade = student.getGrade();
            grade++;
            if (grade<13) {
                student.setGrade(grade);
            } else {
                System.out.println(student.getName()+" has graduated!");
                unenrollStudent(student);
            }
         }
}