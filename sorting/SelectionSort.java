import java.util.Scanner;
import java.util.stream.IntStream;

public class SelectionSort {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }
            int t = ar[i];
            ar[i] = ar[minIndex];
            ar[minIndex] = t;
        }

        IntStream.of(ar).forEach(System.out::println);
    }
}
