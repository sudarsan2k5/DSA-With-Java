import java.util.Scanner;

public class permutation_of_string {
    public static void Solution(String str){
        int n = str.length();
        int f = fact(n);

        for(int i = 0; i < f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for(int div = n; div >= 1; div--){
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }
    }
    public static int fact(int n){
        int val = 1;
        for(int i = 2; i <= n; i++){
            val *= i;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.next();
        Solution(str);
    }
}
