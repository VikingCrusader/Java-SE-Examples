// 小练习：创建一个 Book 类，使用构造方法初始化书名和作者
// 任务
// 定义一个 Book 类，包含两个属性：title（书名，字符串类型）和 author（作者，字符串类型）。

// 给 Book 类写一个构造方法，接受书名和作者两个参数，并初始化属性。

// 在 main 方法中，创建两个 Book 对象，分别赋予不同的书名和作者。

// 打印这两个书的书名和作者。
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Car {
    String brand;
    int year;
    String color;

    public Car(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }
}

public class constructor {
    public static void main(String[] args) {
        Book b1 = new Book("Mathematics", "Professor A");
        Book b2 = new Book("Physics", "Professor B");
        System.out.println(b1.title + " " + b1.author);
        System.out.println(b2.title + " " + b2.author);
        Car c1 = new Car("Volkswagen", 2002, "white");
        Car c2 = new Car("Mercedes", 2020, "silver");
        System.out.println(c1.brand + " " + c1.year + " " + c1.color);
        System.out.println(c2.brand + " " + c2.year + " " + c2.color);
    }
}
