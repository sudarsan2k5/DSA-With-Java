import java.util.Scanner;

public class Print_Zigzag {
    public static void print_zig(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        print_zig(n - 1);
        System.out.print(n + " ");
        print_zig(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        print_zig(n);
    }
}
