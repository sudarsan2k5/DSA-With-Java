import java.util.Scanner;

public class Calculate_NPR {
    public static void print(int n, int r, int npr){
    System.out.print(n + "P" + r + " = " + npr);
    }
    public static int fact(int x){
        int fac = 1;
        for(int i = 1; i <= x; i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;
        print(n, r, npr);
    }
}
