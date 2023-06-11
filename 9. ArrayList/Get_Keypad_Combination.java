import java.util.ArrayList;
import java.util.Scanner;

public class Get_Keypad_Combination {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = String.valueOf(scn.nextInt());
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
}
