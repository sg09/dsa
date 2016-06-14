

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
