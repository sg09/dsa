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
