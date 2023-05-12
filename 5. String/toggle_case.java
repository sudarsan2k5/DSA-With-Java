import java.util.Scanner;

public class toggle_case {
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char up = (char) ('a' + ch - 'a');
                sb.setCharAt(i, up);
            }else if(ch >= 'A' && ch <= 'Z'){
                char lp = (char) ('A' + ch - 'A');
                sb.setCharAt(i, lp);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.next();
        System.out.print(toggleCase(str));
    }
}
