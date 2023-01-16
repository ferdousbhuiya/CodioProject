package String;

public class ArrayExamples {
    public static void main(String[] args) {
        /*
        Fill in the blanks below with code so that the program will
        iterate through a 2D array called family and print the following output:

        Grandpa Grandma
        Dad Mom
        Brother Sister
         */


        String [][] family = { {"Grandpa", "Grandma"},
                {"Dad", "Mom"},
                {"Brother", "Sister"} };

        for (int i = 0; i < family.length; i++) {

            for(int j = 0; j < family[0].length; j++) {

                if(j ==family[0].length - 1) {
                    System.out.println(family[i][j]);
                }
    else {
                    System.out.print(family[i][j] + " ");
                }
            }
        }
    }
}
