import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        int f = fact(n);
        System.out.print("The Fact of Num: " + f);
    }
}
