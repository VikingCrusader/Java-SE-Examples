public class super_test {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.test();
    }
}

class Parent1{
    String name = "Zhangsan";
}

class Child1 extends Parent1{
    String name = "Lisi";
    void test(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}