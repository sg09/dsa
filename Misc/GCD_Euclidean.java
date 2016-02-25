

public class GCD_Euclidean {

    public static void main(String[] args) {
        int gcd = euclidianGcd(100, 10);
        int gcdIter = gcd(100, 10);
        System.out.println("Using recursive approach :" + gcd);
        System.out.println("Using iterative approach :" + gcdIter);

    }

    // Recursive approach
    public static int euclidianGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidianGcd(b, a % b);
    }

    // Iterative approach
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
