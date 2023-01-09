import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int val = 1;
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
