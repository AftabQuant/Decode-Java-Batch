package Semester;

class Animal {
    String name = "Animal";
    void sound() {
        System.out.println("Animal Sound...");
    }
}
class Dog extends Animal {
    String name = "Dog";
    void sound() {
        System.out.println("Dog Sound...");
    }
    void display() {
        System.out.println(super.name);
        super.sound();
    }
}
class Cat extends Dog {
    String name = "Cat";
    void sound() {
        System.out.println("Cat Sound...");
    }
    void display() {
        System.out.println(super.name);
        super.sound();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.display();
    }
}
