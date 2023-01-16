package MethodsAndLoops;

public class SierpinskiTriangle_1 {

    public static void sierpinski(int length, int n, Turtle t) {
        if (n == 1) {
            drawTriangle(length, t);
        } else {
            sierpinski(length, n - 1, t);
            t.right(120);
            t.forward(length);
            sierpinski(length, n - 1, t);
            t.left(120);
            t.forward(length);
            sierpinski(length, n - 1, t);
            t.forward(length);
        }
    }
    /**
     * @param integer length
     * @param Turtle t
     * @return draws a triangle
     */
    public static void drawTriangle(int length, Turtle t) {
       // t.setDirection(180);
        for (int i = 0; i < 3; i++) {
            t.right(120);
            t.forward(length);
        }
    }
}
