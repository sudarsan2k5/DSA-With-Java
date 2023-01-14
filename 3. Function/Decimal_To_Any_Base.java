import java.util.Scanner;

public class Decimal_To_Any_Base {
    public static int getValueIndecimal(int n, int b){
        // write your code
        int rv = 0;

        int p = 1;
        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
}
