import java.util.Scanner;

public class Merge_Two_Sorted_Arrays {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else{
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            res[k] = b[j];
            j++;
            k++;
        }
    return res;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int[] mergeArray = mergeTwoSortedArrays(arr1, arr2);
        print(mergeArray);
    }
}
