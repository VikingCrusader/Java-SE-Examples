public class Lambda_Printer {
    public static void main(String[] args) {
        Printer1 lambdaPrinter = (s) -> System.out.println("Lambda says: " +s);
    }
}

interface Printer1 {
    void print(String s);
}