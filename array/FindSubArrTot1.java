import java.util.Scanner;


public class FindSubArrTot1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int money = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            boolean found =false;
            for (int i=0;i<n;i++){
                int tot =ar[i];
                for (int j=i+1;j<n;j++){
                    if (tot==money){
                        found =true;i=j=n;
                        System.out.println("YES");
                    }
                    if (j>=n){
                        break;
                    }
                    tot+=ar[j];
                }
            }
            if (!found){
                System.out.println("NO");
            }
        }
    }
}
