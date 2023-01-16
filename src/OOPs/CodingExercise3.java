package OOPs;

public class CodingExercise3 {
    public static void main(String[] args) {

        //add code below this line

        Song mySong = new Song("led zeppelin", "ten years gone", "physical graffiti", 0.001);
        mySong.play();
        System.out.println(mySong.getMoneyEarned());
        for (int i = 0; i < 10000; i++) {
            mySong.play();
        }
        System.out.println(mySong.getMoneyEarned());
        //add code above this line
    }
}
