public class stringEqual {
    public static void main (String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "sss";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        String a = new String("xyz");
        String b = new String("xyz");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
} 