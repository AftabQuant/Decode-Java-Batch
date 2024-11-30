package AdvancedOops;

class Plane {
    void takeOff() {
        System.out.println("Plane id taking over...");
    }
    void fly() {
        System.out.println("Plane is flying...");
    }
    void land() {
        System.out.println("Plane is landing...");
    }
}
class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("CargoPlane id taking over...");
    }
    void fly() {
        System.out.println("CargoPlane is flying...");
    }
    void land() {
        System.out.println("CargoPlane is landing...");
    }
}
class FighterPlane extends Plane {
    void takeOff() {
        System.out.println("FighterPlane id taking over...");
    }
    void fly() {
        System.out.println("FighterPlane is flying...");
    }
    void land() {
        System.out.println("FighterPlane is landing...");
    }
}
class NormalPlane extends Plane {
    void takeOff() {
        System.out.println("NormalPlane id taking over...");
    }
    void fly() {
        System.out.println("NormalPlane is flying...");
    }
    void land() {
        System.out.println("NormalPlane is landing...");
    }
}
class Airport {
    void print(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class TruePolymorphism {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();
        NormalPlane n = new NormalPlane();
        Airport a = new Airport();
        a.print(c);
        a.print(f);
        a.print(n);


    }
}
