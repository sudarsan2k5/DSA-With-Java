//import java.util.Scanner;

public class shoet {

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.print(arr[j] +" " + arr[i]);
            }
        }
    }
}
