package School_Money_Management;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Teacher james = new Teacher(1234, "James Bond","Espionage", 100000);
        Teacher sherlock = new Teacher(2345, "Sherlock Holmes", "Deduction", 70000);
        Teacher layton = new Teacher(3456, "Hershel Layton", "Archaeology", 60000);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(james);
        teachers.add(sherlock);
        teachers.add(layton);
        Student cat = new Student(8192, "Catherine Larson", 12);
        Student watson = new Student(24601, "John Watson", 11);
        Student luke = new Student(7856, "Luke Triton", 7);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(cat);
        students.add(watson);
        students.add(luke);
        School hhs = new School(teachers, students);
        hhs.studentsPay(cat, 1200.90);
        System.out.println(cat.getFeesPaid());
        hhs.payTeacher(layton);
        System.out.println(hhs.getTotalMoneyEarned());
    }
}
