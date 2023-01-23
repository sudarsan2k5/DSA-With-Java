import java.util.Scanner;

public class Find_Element_In_An_Array {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == data){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
