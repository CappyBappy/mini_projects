package Codecademy_Challenges;
import java.util.ArrayList;
public class fibonacci {
    int N;
    public fibonacci(int N) {
        this.N=N;
    }
    public void printN() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        for(int i =2;i<this.N;i++) {
            nums.add(nums.get(i-1)+nums.get(i-2));
        }
        for(int i =0; i<nums.size();i++) {
            if(i!=nums.size()-1) {
                System.out.print(nums.get(i) + ", ");
            } else {
                System.out.print(nums.get(i));
            }
        }
    }
    public static void main(String[] args) {
        fibonacci myFib = new fibonacci(50);
        myFib.printN();
    }
}