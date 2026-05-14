import java.util.*;

public class Problem3 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        String text = s.nextLine().toLowerCase();

        String words[] = text.split(" ");

        int max = 0;
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            int count = 0;
           // Checks the repetation of words 
            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = words[i];
            }

            else if (count == max) {

                if (words[i].compareTo(ans) < 0) {
                    ans = words[i];
                }
            }
        }

        System.out.println(ans);
    }
}