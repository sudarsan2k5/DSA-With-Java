import java.util.Scanner;

public class cell_floor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter Search: ");
        int data = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int cell = 0;
        int floor = 0;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(data < arr[mid]){
                hi = mid -1;
                cell = arr[mid];
            }else if(data > arr[mid]){
                lo = mid + 1;
                floor = arr[mid];
            }else{
                cell = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(cell);
        System.out.print(floor);
    }
}
