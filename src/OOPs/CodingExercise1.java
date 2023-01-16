package OOPs;

public class CodingExercise1 {
    public static void main(String[] args) {

        //add code below this line

        Fruit myFruit = new Fruit("strawberry", "red");

        System.out.println(myFruit.getName());
        System.out.println(myFruit.getColor());

        myFruit.setName("tangerine");
        myFruit.setColor("orange");
        System.out.println(myFruit.getName());
        System.out.println(myFruit.getColor());

        //add code above this line
    }
}
