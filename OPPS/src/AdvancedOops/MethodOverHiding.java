package AdvancedOops;

class Parent {
    public void display(){
        System.out.println("Parent Method...");
    }
}
class Child extends Parent {
    public void display(){
        System.out.println("Child Method...");
    }
}
public class MethodOverHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();
        Parent p2 = new Child();
        p2.display();
    }
}
