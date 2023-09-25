import java.util.Scanner;
public class print_2d_Array {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int r = scn.nextInt();
            int c = scn.nextInt();
            int [][] arr = new int[r][c];
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    arr[i][j] = scn.nextInt();
                }
            }
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
