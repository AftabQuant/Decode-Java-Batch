package AdvancedOops;

abstract class Parent3 {
    public abstract void methodOne();
}
class Child3 {
    public void methodOne() {
        System.out.println("Abstraction is occurring ... ");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Child3 p = new Child3();
        p.methodOne();
    }
}
