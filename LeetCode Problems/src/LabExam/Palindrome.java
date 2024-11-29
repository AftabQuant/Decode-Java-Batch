package LabExam;

public class Palindrome {
    static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        if(str.contentEquals(sb.reverse())) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcb"));
    }
}
