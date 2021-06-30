//import java.util.ArrayList;
public class BinarySearchTree {
    //This is code that I used before that i no longer need because I misunderstood the project ;)
    /*ArrayList<Node> bst = new ArrayList<Node>();
    public BinarySearchTree(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if(i==0) {
                bst.add(new Node(nums[0], true));
                //System.out.println("Root num "+nums[0]+ " added");
            }
            else {
                bst.add(new Node(nums[i], false));
                //System.out.println("num "+nums[i]+ " added");
            }
        }

    }
    public void orderTree() {

    }*/
    

    public static void main(String[] args) {
        /*int[] myArray = {5, 6, 90, 72, 35, 46, 47, 10};
        BinarySearchTree myTree = new BinarySearchTree(myArray);
        System.out.println(myArray[2]);*/

        int[] array = {34, 67, 89, 29, 57, 20};
        Node N = new Node(array[0]);
        for (int i : array) {
            N.insertNum(i);
        }
        System.out.println(N.rightnum.rightnum);
    }
}