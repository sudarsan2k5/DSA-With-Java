import java.util.Scanner;

public class Algebraic_Expression {
    public static void main(String[] args) {
        float result;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter x: ");
        int x = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();

        result = (a * x + b) + (a * x - b);
        System.out.print("The evaluate algebraic expressionm Is: " + result);
    }
}
