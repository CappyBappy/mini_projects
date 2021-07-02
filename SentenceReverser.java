import java.util.ArrayList;
public class SentenceReverser {
    //yet again, Catherine misunderstood the task at hand...
    public static boolean arrayContains(char[] array, char inputChar) {
        boolean contains = false;
        for(int i = 0; i<array.length;i++) {
            if(array[i]==inputChar) {
                contains= true;
            }
        }
        return contains;
    }
    public String reverse(String input) {
        ArrayList<String> inputArray = new ArrayList<String>();
        ArrayList<Integer> indexOfSpaces = new ArrayList<Integer>();
        String newString = "";
        char[] punctuation = {'.','!','?',';',':'};
        char lastChar = ' ';
        boolean lastIsPunct = false;
        for(char punct: punctuation) {
            if(input.charAt(input.length()-1)==punct) {
                lastIsPunct= true;
                lastChar=punct;
            }
        }

        for(int i=0;i<input.length()-1;i++) {
            if(input.charAt(i) == ' ') {
                indexOfSpaces.add(i);
            }
        }
        for(int i=0; i<indexOfSpaces.size();i++) {
            if(i==0) {
                
                inputArray.add(input.substring(0, (indexOfSpaces.get(i)-1)));
            } else {
                inputArray.add(input.substring((indexOfSpaces.get(i-1)+1), (indexOfSpaces.get(i)-1)));
            }
        }
        for(int i=0;i<inputArray.size();i++) {
            for(int j = 0;j<inputArray.get(i).length()-1; j++) {
                if(arrayContains(punctuation, inputArray.get(i).charAt(j))) {
                    String newSring = inputArray.get(i).substring(0, j-1);
                    inputArray.set(i, newSring);
                }
            }
        }
        int numWords = inputArray.size();
        for(int i = 0; i<numWords/2;i++) {
            String a = inputArray.get(i);
            String b = inputArray.get(inputArray.size()-1-i);
            inputArray.set(i, b);
            inputArray.set(inputArray.size()-1-i,a);
        }   
        for(int i = 0; i<inputArray.size();i++) {
            newString+=inputArray.get(i);
            newString+=" ";
        }
        if(lastIsPunct) {
            newString+=lastChar;
        }
        return newString;
    }
    public static void main(String[] args) {
        SentenceReverser myReverser = new SentenceReverser();
        System.out.println(myReverser.reverse("May the force be with you."));
    }
}