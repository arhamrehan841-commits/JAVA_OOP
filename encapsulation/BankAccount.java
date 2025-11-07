// File: BankAccount.java

// This class demonstrates encapsulation in Java using a bank account example
class BankAccount {
    
    // PRIVATE variables cannot be accessed directly from outside the class
    private String acc_num = "N/A";
    private float acc_balance = 0;

    // Public method to update account number
    void updateAccNum(String bankAccNum) {
        acc_num = bankAccNum; // update private variable
        System.out.println("Account number updated to: " + bankAccNum);
    }

    // Public method to update account balance
    void updateAccBalance(float bankAccBalance) {
        if (bankAccBalance < 0) {
            System.out.println("Balance cannot be negative"); // validation
        } else {
            acc_balance = bankAccBalance; // update private variable
            System.out.println("Account balance updated to: " + bankAccBalance);
        }
    }

    // Public method to view account information
    void seeInfo() {
        System.out.println("Account number: " + acc_num);
        System.out.println("Account balance: " + acc_balance);
    }
}

// Test the class in main
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        // Using public methods to update private variables
        b.updateAccBalance(10000);
        b.updateAccNum("b24323u9uje2342325ww323r4");

        // Using public method to view info
        b.seeInfo();
    }
}
