import java.util.Scanner;

public class wave_traaversal {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter Array Rows: ");
    int rows = scn.nextInt();
    System.out.print("Enter Array Cols: ");
    int cols = scn.nextInt();
    int[][] arr = new int[rows][cols];

    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
      }
    for(int j = 0; j < arr[0].length; j++){
        if(j % 2 == 0){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i][j]);
            }
        }else{
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.println(arr[i][j]);
            }
        }
    }
   }
}
