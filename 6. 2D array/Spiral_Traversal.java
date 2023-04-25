import java.util.Scanner;

public class Spiral_Traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = scn.nextInt();
        System.out.print("Enter Colms: ");
        int colm = scn.nextInt();

        int[][] arr = new int[rows][colm];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int totallNumEle = rows * colm;
        int count = 0;
        while(count < totallNumEle){
            //left wall
            for(int i = minr, j = minc; i <= maxr && count < totallNumEle; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            for(int i = maxr, j = minc; j <= maxc && count < totallNumEle; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //right wall
            for(int i = maxr, j = maxc; i >= minr && count < totallNumEle; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //top wall
            for(int i = minr, j = maxc; j >= minc; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
