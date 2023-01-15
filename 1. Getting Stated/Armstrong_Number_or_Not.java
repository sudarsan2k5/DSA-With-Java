import java.util.Scanner;

public class Armstrong_Number_or_Not {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r, arm = 0;
        System.out.print("Enter Any num: ");
        int num = scn.nextInt();
        int num1 = num;
        while(num > 0){
            r = num % 10;
            arm = (r * r * r) + arm;
            num = num / 10;
        }
        if(num1 == arm){
            System.out.print("The Armstrong Number is: " + arm);
        }else{
            System.out.print("This is not Armstrong Number");
        }
    }
}
