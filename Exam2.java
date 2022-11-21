import java.lang.*;
import java.util.*;

public class Exam2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char a = str2.charAt(str2.length() - 1);

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == a) {
                count++;
            }
        }

        System.out.println(count);
    }
}
