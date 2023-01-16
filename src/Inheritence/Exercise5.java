package Inheritence;

public class Exercise5 {
    public static void main(String[] args) {

        //add code below this line
        PlatinumClient p = new PlatinumClient("Sarah", "101 Main Street", 123364);
        p.processSale(100);
        System.out.println(p.getRewards());
        System.out.println(p.getBalance());
        p.makePayment(50);
        System.out.println(p.getBalance());
        System.out.println(p.info());

        //add code above this line
    }

}
