package AdvancedOops;

class Dog {

}
class Cat extends Dog {

}
class Animal {
    public void print(Dog d){
        System.out.println("Dog Version ....");
    }
    public void print(Cat c){
        System.out.println("Cat Version ....");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Animal am = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        am.print(c);
        am.print(d);
        Dog dg = new Cat();
        am.print(dg);
    }
}
