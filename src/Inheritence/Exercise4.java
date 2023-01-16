package Inheritence;

public class Exercise4 {
    public static void main(String[] args) {

        //add code below this line
        double[][] accounts = {{10000, 13000, 22000},
                {30000, 7000, 19000},
                {15000, 23000, 31000}};
        RegionalBank rb = new RegionalBank("Main Street Bank", 9, accounts);
        System.out.println(rb.regionalTotal());

        //add code above this line
    }
}
