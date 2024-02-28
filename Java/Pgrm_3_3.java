
//WAP to find the sum of the series 1+(1+2)+(1+2+3)+............ +(1+2+3+…+n) using a single while loop.

import java.util.*;

public class Pgrm_3_3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value n:");
        int n = s.nextInt();
        int tsum = 0;
        int sum = 0;

        int i = 1;

        while (i <= n) {
            sum += i;
            tsum += sum;
            System.out.print("\t" + sum);

            i++;
        }
        System.out.println("\nsum of the series is: " + tsum);
        s.close();
    }

}