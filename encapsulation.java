class User {
    private String password;

    //setting a passowrd
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 6) {
            this.password = newPassword;
        } else {
            System.out.println("The password is not safe, at least 6 digits!");
        }
    }

    public boolean checkPassword(String input) {
        return this.password.equals(input);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 8) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("At least 8 digits, try again.");
        }
    }

    public String getAccountnumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited, your current balance is " + this.balance + ".");
        } else {
            System.out.println("unsucceessful deposit");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawed, your current balance is " + this.balance + ".");
        } else {
            System.out.println("unsucceessful withdraw");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        
    }
}
