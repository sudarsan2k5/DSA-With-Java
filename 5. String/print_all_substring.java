import java.util.Scanner;

public class print_all_substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Some String: ");
        String s = scn.next();
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
