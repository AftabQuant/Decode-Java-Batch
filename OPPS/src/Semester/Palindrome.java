package Semester;

public class Palindrome {
    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString())) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("eye"));
        System.out.println(isPalindrome("abc"));
    }
}
