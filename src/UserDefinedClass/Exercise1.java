package UserDefinedClass;

public class Exercise1 {
    public static void main(String[] args) {

        //add code below this line

        Car c = new Car(10);
        RideShare rc = new RideShare(20, 0.5);
        Subway s = new Subway(7.25);

        System.out.println(c.travel());
        System.out.println(rc.travel());
        System.out.println(s.travel());

        //add code above this line

    }
}
