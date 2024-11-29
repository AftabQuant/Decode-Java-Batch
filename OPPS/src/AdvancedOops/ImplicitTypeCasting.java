package AdvancedOops;

class TypeCasting {
    public void print(int data){
        System.out.println("int data");
    }
    public void print(double data){
        System.out.println("double data");
    }
}
public class ImplicitTypeCasting {
    public static void main(String[] args) {
        TypeCasting tc = new TypeCasting();
        tc.print(5.6f);
    }
}
