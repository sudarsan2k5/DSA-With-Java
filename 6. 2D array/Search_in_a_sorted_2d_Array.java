import java.util.Scanner;

public class Search_in_a_sorted_2d_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.print("Enter Your Num: ");
        int x = scn.nextInt();

        int i = 0;
        int j = arr[0].length - 1;
        while(i < arr.length && j >= 0){
            if(x == arr[i][j]){
                System.out.print(i);
                System.out.print(j);
                return;
            }else if(x < arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
