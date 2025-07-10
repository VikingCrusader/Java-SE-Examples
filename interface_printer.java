public class interface_printer {
    public static void main(String[] args) {
        Printer p = new ConsolePrinter(); //Printer 不可以被实例化，其子类才可以
        p.print("Hello World");
    }
}

interface Printer{
    void print(String text);
}

class ConsolePrinter implements Printer{
    public void print(String text){
        System.out.println("Console: "+text);
    }
}
