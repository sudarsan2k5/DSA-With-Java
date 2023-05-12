import java.util.Scanner;

public class String_two_cons_char {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i < sb.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            int gap = curr - pre;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.next();
        System.out.print(solution(str));
    }
}
