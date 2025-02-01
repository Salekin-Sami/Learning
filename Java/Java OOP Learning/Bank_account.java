import java.util.HashMap;
import java.util.Map;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to get account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    // Method to add an account to the bank
    public void addAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber, accountHolder, initialBalance);
            accounts.put(accountNumber, account);
            System.out.println("Account added: " + accountNumber);
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    // Method to remove an account from the bank
    public void removeAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            System.out.println("Account removed: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display all accounts in the bank
    public void displayAllAccounts() {
        for (Account account : accounts.values()) {
            account.displayAccountDetails();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding accounts
        bank.addAccount("1001", "Alice", 1000.0);
        bank.addAccount("1002", "Bob", 1500.0);

        // Displaying all accounts
        bank.displayAllAccounts();

        // Depositing money
        bank.deposit("1001", 500.0);

        // Withdrawing money
        bank.withdraw("1002", 300.0);

        // Displaying all accounts after transactions
        bank.displayAllAccounts();

        // Removing an account
        bank.removeAccount("1001");

        // Displaying all accounts after removing one
        bank.displayAllAccounts();
    }
}
