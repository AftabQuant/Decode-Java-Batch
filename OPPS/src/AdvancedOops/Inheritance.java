package AdvancedOops;

class Person {
    public String name;
    public String add;
    public int age;
}
class Student extends Person {
    public String grade;
    public double marks;
    public Student(String name, String add, int age, String grade, double marks){
        this.name = name;
        this.add = add;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    public void display(){
        System.out.println(name);
        System.out.println(add);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(marks);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student("Aftab", "Singur", 20, "a+", 93.9);
        s.display();
    }

}
