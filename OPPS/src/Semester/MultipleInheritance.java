package Semester;

class Plane {
    String name = "Plane";
    double price = 2000.0;
    int time = 11;
}
class Cargo extends Plane {
    String pName = "Cargo";
}
class Fighter extends Cargo {
    String fName = "Fighter";
}
class Display extends Fighter {
    void print() {
        System.out.println(fName);
        System.out.println(pName);
        System.out.println(name);
        System.out.println(price);
        System.out.println(time);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Display f = new Display();
        f.print();
        int p = 1000;
        int r = 5;
        int t = 2;
        double x = Math.pow(p * (1 +r/100), t);
        System.out.println(x);
        double y = 2 * ((double)22/7) * 4;
        System.out.println(y);
    }
}
