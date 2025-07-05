public class hotelLogin {
    public static void main(String[] args) {
        // welcome interface
        System.out.println("Welcome to Yiwen Hotel!");
        System.out.println("-----------------------");

        // receiving the username and password of the guest
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Welcome for using the management system of Yiwen Hotel V1.0, please do the identification process");
        System.out.println("Username:");
        String username = s.next();
        System.out.println("Password:");
        String password = s.next();

        // Assuming the uname of admin is "admin", pwd is 1234.
        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Login Successful!");
        } else {
            System.out.println("Password incorrect!");
        }
    }
}
