class BankAccount {
    private int accountNo;
    private String accountHolderName;
    private String accountType;
    private long balance;

    public BankAccount(int accountNo, String accountHolderName, String accountType, long balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    //getter
    public int getAccountNo() { //Accessor Method
        return accountNo;
    }

    //setter
    // public void setAccountNo(int accountNo) {    //Mutator Method
    //     this.accountNo = accountNo;
    // }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    //toString() - Represents an object in a string format
    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
                + accountType + ", balance=" + balance + "]";
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount(101, "Saumyya", "Current", 2300000);

        System.out.println(bankacc.getAccountNo());
        System.out.println(bankacc.getAccountHolderName());
        System.out.println(bankacc.getAccountType());
        System.out.println(bankacc.getBalance());

        bankacc.setAccountHolderName("Saumyya Dalal");
        bankacc.setAccountType("Savings");

        System.out.println(bankacc.toString());

    }
}

/*
Getter and Setter Method: 
used to access and update the private data members of the class, from anywhere.


Tasks:
Package:

Scenario 1: Banking System
Create a package called "bank" that contains classes like "Account," "Transaction," and "Customer" that are related to banking operations. Place these classes in the "bank" package to organize and group them together.

Scenario 2: E-commerce Platform
Design a package called "ecommerce" that includes classes like "Product," "Cart," and "Order" that are related to online shopping. Place these classes in the "ecommerce" package to encapsulate and manage them as a cohesive unit.

Scenario 3: Hospital Management System
Develop a package called "hospital" that contains classes like "Doctor," "Patient," and "Appointment" that handle various aspects of managing a hospital. Place these classes in the "hospital" package to provide organization and separation from other modules.
*/