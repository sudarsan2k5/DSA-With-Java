import java.util.Scanner;

public class Print_Decreasing {
    public static void print_dic(int n){
        if(n == 0)
            return;
        System.out.println(n);
        print_dic(n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_dic(n);
    }
}
