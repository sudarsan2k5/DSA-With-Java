import java.util.Scanner;

public class First_Index {
    public static int first_in(int[] arr, int idx, int data){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == data){
            return idx;
        }else{
            int fiisa = first_in(arr, idx + 1, data);
            return fiisa;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int fi = first_in(arr, 0, data);
        System.out.print(data);
    }
}
