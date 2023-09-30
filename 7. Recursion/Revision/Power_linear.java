import java.util.Scanner;

public class Power_linear {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = pow(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.print(pow(x, n));
    }
}
