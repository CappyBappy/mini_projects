package Codecademy_Challenges;
public class Node {
    int num;
    Node leftnum;
    Node rightnum;

    public Node(int num) {
        this.num=num;
        this.leftnum= null;
        this.rightnum= null;
    }

    public void insertNum(int i) {
        if(i<this.num) {
            if(this.leftnum==null) {
                this.leftnum = new Node(i);
            }
            else {
                this.leftnum.insertNum(i);
            }
        } else {
            if(this.rightnum==null) {
                this.rightnum = new Node(i);
            }
            else {
                this.rightnum.insertNum(i);
            }
        }
    }
}