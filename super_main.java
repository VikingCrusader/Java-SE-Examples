class Person {
    Person(String name) {
        System.out.println("Person:"+name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
        System.out.println("Student:"+name);
    }
}

public class super_main {
    public static void main(String[] args) {
        Student s = new Student("小明");
    }
}
