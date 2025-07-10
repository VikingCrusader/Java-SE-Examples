public class constructor_test {
    public static void main(String[] args) {
        System.out.println("before");
        User11 user = new User11();
        System.out.println("after");

        //构造方法：专门用于构建对象
        //如果一个类中没有任何构造方法，那么JVM会自动添加一个公共的，无参的构造方法
        //基本语法：类名（）{}
        //构造方法也是方法，但是没有void关键字
        //方法名和类名完全相同
        //如果类中没有构造方法，那么JVM会提供默认的构造方法
        //如果类中有构造方法，那么JVM不会提供
        //构造方法也是方法，也可以传递参数，一般传递参数的目的是用于对象的赋值

        user.test();
    }
}

class User11{

    User11(){
        System.out.println("user...");
    }

    void test(){
        System.out.println("test");
    }
}