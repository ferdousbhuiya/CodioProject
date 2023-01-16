package Polymorphism;

public class Exercise5 {
    public static void main(String[] args) {
        String source = "/home/codio/workspace/code/polymorphism/exercise5/words.txt";
        String answer = "/home/codio/workspace/code/polymorphism/exercise5/answer.txt";

        //add code below this line

        Stars s = new Stars(source, answer);
        s.swapWords();
        //add code above this line
    }

}
