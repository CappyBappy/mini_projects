package Codecademy_Challenges;
import java.util.ArrayList;
//there are some slight bugs, can fix if wanted

public class WordReverser {
    //reverses orders of words with punctuation and keeps punctuation in place
    public void reverse(String input) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++) {
            chars.add(input.charAt(i));
        }
        ArrayList<Integer> indexOfPunctuation = new ArrayList<Integer>(); //This lets us know where in the input there are pieces of punctuation. It can be refined a bit by using an array of punctuation options in the future.
        for(int i = 0; i < chars.size();i++) {
            if(chars.get(i)=='.'||chars.get(i)=='!'||chars.get(i)=='?'||chars.get(i)==';'||chars.get(i)==':'||chars.get(i)==',') {
                indexOfPunctuation.add(i);
            }
        }
        ArrayList<Integer> indexOfSpaces = new ArrayList<Integer>(); //This lets us know where there are the nearest spaces next to the punctuations, aka where words begin
        for(int i = 0; i < indexOfPunctuation.size();i++) {
            boolean spaceNotFound = true;
            int index = indexOfPunctuation.get(i);
            while (spaceNotFound) {
                if(chars.get(index)==' '||index==0) {
                    indexOfSpaces.add(index);
                    spaceNotFound = false;
                } else {
                    index--;
                }
            }
        }
        for(int i = 0; i < indexOfPunctuation.size();i++) {
            int wordLength = 0;
            if(indexOfSpaces.get(i) == 0) {
                 wordLength = indexOfPunctuation.get(i);
            } else {
             wordLength = indexOfPunctuation.get(i)-indexOfSpaces.get(i)-1;
            }
                for(int j = 0; j < wordLength/2;j++) {
                    char first;
                    if(indexOfSpaces.get(i)==0) {
                        first = chars.get(0);
                    } else {
                    first = chars.get(indexOfSpaces.get(i)+1+j);}
                    char last = chars.get(indexOfPunctuation.get(i)-1-j);
                    if(indexOfSpaces.get(i)==0) {
                        chars.set(0, last);
                    } else {
                        chars.set((indexOfSpaces.get(i)+1+j), last);
                    }
                    chars.set((indexOfPunctuation.get(i)-1-j), first);
                }
        }
        String newSentence = "";
        for(int i = 0; i<chars.size(); i++) {
            newSentence+=chars.get(i);
        }
        System.out.println(newSentence);

    }

    public static void main(String[] args) {
        WordReverser word = new WordReverser();
        word.reverse("Hi my dudes! It's ya boi, john, back with another AWESOME Fortnite video!");
    }
}