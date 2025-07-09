public class oop {
    public static void main(String[] args) {
        Student xiaoming = new Student();
        xiaoming.name = "xiaoming";
        xiaoming.age = 21;
        xiaoming.gender="male";  
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        System.out.println(xiaoming.gender);
    }
}

class Student {
    String name;
    int age;
    String gender;

    void setName(String name) {
        this.name = name;
    }
}


