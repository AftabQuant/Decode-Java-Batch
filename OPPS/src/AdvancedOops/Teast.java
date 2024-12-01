package AdvancedOops;

class Parent2 {
    public Object methodOne() {
        return null;
    }
}
class Child2 extends Parent2 {
    public String methodOne() {
        System.out.println("Hello From Child Class..");
        return null;
    }
}
public class Teast {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.methodOne();
    }
}
