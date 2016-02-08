

import java.util.Scanner;


public class FindSubArrTot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int money= sc.nextInt();
            int[] ar = new int[n];
            for (int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            boolean found =false;

            for (int i=0;i<n;i++){
                for (int j=i;j<n;j++){
                    int tot=0;
                    for (int k=i;k<=j;k++){
                        tot+=ar[k];
                    }
                    if (tot==money){
                        found=true;j=i;i=n;
                        System.out.println("YES");
                    }
                }
            }
            if (!found){
                System.out.println("NO");
            }
        }
    }
}

    Feb 6 dsa 

    Facebook
    Twitter
    Google
    Tumblr

Bubble Sort

import java.util.Scanner;


public class BubbleSort {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] ar = new int[n];
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (ar[i]<ar[j]){
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }

        for (int i=0;i<n;i++){
            System.out.println(ar[i]);
        }

    }
}

    Feb 6 dsa sorting 

    Facebook
    Twitter
    Google
    Tumblr

Spiral traversal of a 2-d array

import java.util.Scanner;


public class ArraySpiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        int t = 0;
        int l = 0;
        int b = m - 1;
        int r = n - 1;
        int dir = 0;
        while (t <= b && l <= r) {
            //left to right
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    System.out.print(ar[t][i] + " ");
                }
                t++;
            }
            //top to bottom
            else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    System.out.print(ar[i][r] + " ");
                }
                r--;
            }
            //right to left
            else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    System.out.print(ar[b][i] + " ");
                }
                b--;
            }
            //bottom to top
            else if (dir == 3) {
                for (int i = b; i >= t; i--) {
                    System.out.print(ar[i][l] + " ");
                }
                l++;
            }

            dir = (dir + 1) % 4;
        }
    }
}
