import java.util.Scanner;

public class Print_Decreasing_Increasing {
    public static void print_dic_inc(int n){
        if(n == 0)
            return;
        System.out.println(n);
        print_dic_inc(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_dic_inc(n);
    }
}
