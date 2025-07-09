public class overloading {

    // 加法：两个整数
    public int add(int a, int b) {
        return a + b;
    }

    // 加法：两个小数
    public double add(double a, double b) {
        return a + b;
    }

    // 加法：三个整数
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        overloading calc = new overloading();

        System.out.println(calc.add(3, 4));          // 输出 7
        System.out.println(calc.add(2.5, 4.7));      // 输出 7.2
        System.out.println(calc.add(1, 2, 3));       // 输出 6
    }
}
