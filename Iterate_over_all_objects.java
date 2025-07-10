import java.util.ArrayList;

class Person11 {
    private String name;
    private int age;

    // 静态列表，用于保存所有创建的对象
    private static ArrayList<Person11> allPersons = new ArrayList<>();

    public Person11(String name, int age) {
        this.name = name;
        this.age = age;
        allPersons.add(this);  // 每创建一个对象，就添加到列表中
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 静态方法：返回所有对象
    public static ArrayList<Person11> getAllPersons() {
        return allPersons;
    }
}

public class Iterate_over_all_objects {
    public static void main(String[] args) {
        new Person11("Alice", 25);
        new Person11("Bob", 30);
        new Person11("Charlie", 28);

        // 遍历所有对象
        for (Person11 p : Person11.getAllPersons()) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }
}
