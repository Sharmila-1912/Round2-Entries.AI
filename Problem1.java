import java.util.*;

public class Problem1{

    // Function to find second largest distinct element
    public static int findSecondLargest(int[] arr) {
        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {

            // Update largest
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            }

            // Update second largest only if distinct
            else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        // If no second distinct element
        return (secondLargest == null) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        int n=s.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++){
a[i]=s.nextInt();
}

        int result = findSecondLargest(a);

        System.out.println("Second Largest Distinct Element: " + result);
    }
}