package String;

public class IntArray {
    public static void main(String[] args) {
        int [][] squares = {{1,4},{9,16}};
        for (int [] i : squares)
        {
            for(int j: i)
            {
                if(j==4 | j==16)
                {
                    System.out.println(j);
                }
                else {
                    System.out.print(j+" ");
                }
            }
        }
    }
}
