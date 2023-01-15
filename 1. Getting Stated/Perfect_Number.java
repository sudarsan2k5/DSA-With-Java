import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        int  sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Any Num: ");
        int num = scn.nextInt();
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.print("Perfect Num");
        }else{
            System.out.print("Not Perfect");
        }
    }
}
