package OOPs;

public class CodingExercise4 {
    public static void main(String[] args) {

        //add code below this line

        Atm myAtm = new Atm(1000);
        myAtm.deposit(50);
        System.out.println(myAtm.getMoney());
        myAtm.withdraw(925);
        System.out.println(myAtm.getMoney());
        //add code above this line
    }
}
