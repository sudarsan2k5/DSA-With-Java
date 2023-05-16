import java.util.Scanner;

public class Power_Linear {
    public static int power_linear(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power_linear(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power_linear(x, n);
        System.out.print(xn);
    }
}
