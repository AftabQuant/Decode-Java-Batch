package Semester;

public class Patterns {
    static void print() {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
