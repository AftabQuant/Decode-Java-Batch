package Semester;

class Person {
    String name = "Aftab";
    int age = 21;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Aftab extends Person {
    String clg = "Hello";
    void print() {
//        System.out.println(name);
//        System.out.println(age);
        display();
        System.out.println(clg);
        System.out.println();
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Aftab a = new Aftab();
        a.print();
    }
}
