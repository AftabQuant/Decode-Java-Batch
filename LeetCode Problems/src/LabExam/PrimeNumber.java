package LabExam;

public class PrimeNumber {
    static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i=2; i<=num; i++)
            if (num % 2 == 0) return false;
            else return true;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
    }
}
