package LabExam;

class Student{
    String name ;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class InfoOfStudent {
    public static void main(String[] args) {
        Student st = new Student("Aftab", 32);
        st.display();
    }
}
