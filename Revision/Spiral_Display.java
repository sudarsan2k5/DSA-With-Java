import java.util.Scanner;

public class Spiral_Display {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;

        int maxr = arr.length;
        int maxc = arr[0].length - 1;

        int tne = n * m;
        int cnt = 0;
        while(cnt < tne){
            //left wall
            for(int i = minr; i < maxr && cnt < tne; i++){
                System.out.println(arr[i][minc]);
            }
            for(int i = minc; i < maxc; i++){
                System.out.println(arr[i][minr]);
            }
            for(int i = maxr; i >= minr; i--){
                System.out.print(arr[i][maxc]);
            }
            for(int i = maxc; i >= minc; i--){
                System.out.print(arr[i][minr]);
            }
        }
    }
}
