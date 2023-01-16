package Polymorphism;

public class LabChallenge {
    public static void main(String[] args) {

        //add code below this line

        Chef c1 = new Chef("Marco Pierre White");
        Chef c2 = new Chef("Rene Redzepi", "Nordic");
        Chef c3 = new Chef("Thomas Keller", "French", 3);

        System.out.println(c1.display());
        System.out.println(c2.display());
        System.out.println(c3.display());
        //add code above this line
    }

}
