import java.util.*;

public class Problem2 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        String a = s.nextLine();

        // Remove spaces and special characters, convert to lowercase
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(a);

        String rev = sb.reverse().toString();

        if (a.equals(rev)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}