

public class Pyramid {

   public static void main(String[] args) {

       int n = 15;

       for (int i = 0; i < n; i++) {

           for (int j = 0; j < n - i; j++) {

               System.out.print(“ ”);

           }

           for (int k = 0; k <= i; k++) {

               System.out.print(“$ ”);

           }

           System.out.println();

       }

   }

}

    Feb 7 d