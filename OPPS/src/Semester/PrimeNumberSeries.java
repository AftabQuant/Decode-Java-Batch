package Semester;

public class PrimeNumberSeries {
    static boolean isPrime(int num) {
        for(int i=2; i<=num/2; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    static void primeSeries(int n) {
        for(int i=2; i<=n; i++) {
            boolean flag = true;
            for(int j=2; j<=i/2; j++) {
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
        primeSeries(100);
    }
}
