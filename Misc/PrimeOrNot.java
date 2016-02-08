import java.util.Scanner;

public class PrimeOrNot {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();

       for (int j = 0; j < t; j++) {

           int n = sc.nextInt();

           if (n == 2) {

               System.out.println(“Not prime”);

           } else if (n % 2 == 0) {

               System.out.println(“Not prime”);

           } else {

               int sqrtOfN = (int) Math.sqrt(n);

               boolean notMet = true;

               for (int i = 3; i <= sqrtOfN && notMet; i += 2) {

                   if (n % i == 0) {

                       notMet = false;

                       i = sqrtOfN;

                   }

               }

               if (notMet) {

                   System.out.println(“Prime”);

               }

           }

       }

   }

}
