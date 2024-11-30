package AdvancedOops;

class AdvancedCalculator {
    public void sum(int... array){
        int sum = 0;
        for(int dt: array) sum+=dt;
        System.out.println(sum);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.sum(10,20);
        ac.sum(10,20,30);
        ac.sum(10,20,30,40);
        ac.sum(10,20,30,40,50);
    }
}
