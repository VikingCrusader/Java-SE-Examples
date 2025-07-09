public class functions {
    public static void main(String[] args) {
        System.out.println("声明一个方法");
        int c = sum(1, 2);
        System.out.println(c);
    }

    public static int sum(int a, int b) {
        return a + b;  //有static，直接调用即可
    }
    
    public int sum1(int a, int b) {
        return a + b;  //无static，必须创建对象才能调用
    }
}
