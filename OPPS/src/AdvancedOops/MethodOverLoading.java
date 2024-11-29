package AdvancedOops;

class Addition {
    public int add(int a, int b) {
        return a+b;
    }
    public double add(double a, int b){
        return  a+b;
    }
    public double add(int a, double b) {
        return a+b;
    }
    public double add(double a, double b){
        return  a+b;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Addition ad = new Addition();
        System.out.println(ad.add(3.5,4.9));
    }
}
