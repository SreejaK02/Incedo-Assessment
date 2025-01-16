package Day1Java;

import java.util.Scanner;

public class Armstrong {
      public static void main(String args[]) {
            int sum = 0;
            Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int digitCount = 0;

            for (int tempNumber = n; tempNumber != 0; tempNumber /= 10) {
                  digitCount++;
            }
            int z = n;
            while (n != 0) {
                  int n1 = n % 10;
                  sum += (Math.pow(n1, digitCount));
                  n = n / 10;

            }
            if (z == sum) {
                  System.out.println("It is an armstrong number");
            }
            else{
                  System.out.println("It is not an armstrong number");

            }
      }
}