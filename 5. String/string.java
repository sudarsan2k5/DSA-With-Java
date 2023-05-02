import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        String s1 = scn.next();
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
