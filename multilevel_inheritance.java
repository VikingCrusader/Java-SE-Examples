class Animals {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dogs {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // 继承自 Animal
        p.bark();  // 继承自 Dog
        p.weep();  // 自己定义
    }
}