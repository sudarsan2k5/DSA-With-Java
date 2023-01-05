import java.util.Scanner;

public class digits_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;
        int Temp = n;
        while(Temp != 0){
            Temp = Temp / 10;
            nod++;
        }
        int div = (int)Math.pow(10, nod - 1);
        while(div != 0){
            int ans = n / div;
            System.out.println(ans);

            n = n % div;
            div = div / 10;

        }
    }
}
