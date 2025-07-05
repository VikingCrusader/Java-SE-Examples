public class keyInput {
    public static void main (String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        String msg = s.next();
        System.out.println("my name is"+msg);
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        System.out.println(val1+val2);
    }
} 