import java.util.Scanner;

public class Max_Of_An_Array {
    public static int max_array(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = max_array(arr, idx + 1);
        if(misa > arr[idx]){
            return misa;
        }else {
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
       int max = max_array(arr, 0);
        System.out.print(max);
    }
}
