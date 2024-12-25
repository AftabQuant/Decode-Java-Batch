package Semester;

class Student {
    String name;
    int age;
    static String college = "HIT";
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
        System.out.println();
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student a = new Student("Aftab",21);
        a.print();
        Student b = new Student("Aftab",21);
        b.print();
    }
}
