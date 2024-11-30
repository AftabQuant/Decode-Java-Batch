package AdvancedOops;

class Parent1 {
    void property() {
        System.out.println("Money + Gold + Everything");
    }
    void marry() {
        System.out.println("Relative Girl");
    }
}
class Child1 extends Parent1 {
    void marry() {
        System.out.println("Other Girl");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.property();
        p.marry();
        System.out.println();
        Child1 c = new Child1();
        c.property();
        c.marry();
        System.out.println();
        Parent1 pt = new Child1(); //Runtime Object
        pt.property();
        pt.marry();
    }
}
