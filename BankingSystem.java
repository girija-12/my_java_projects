package lab_exercise;

public class BankingSystem {

    // Define the Account interface
    interface Account {
        double getBalance();
        void deposit(double amount);
        void withdraw(double amount);
        String getAccountType();
    }

    // Define the Transaction interface
    interface Transaction {
        void execute();
        String getTransactionDetails();
    }

    // Implement the SavingsAccount class
    static class SavingsAccount implements Account {
        private double balance;

        public SavingsAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        @Override
        public double getBalance() {
            return balance;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        @Override
        public String getAccountType() {
            return "Savings Account";
        }
    }

    // Implement the CheckingAccount class
    static class CheckingAccount implements Account {
        private double balance;

        public CheckingAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        @Override
        public double getBalance() {
            return balance;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        @Override
        public String getAccountType() {
            return "Checking Account";
        }
    }

    // Implement the Deposit class
    static class Deposit implements Transaction {
        private Account account;
        private double amount;

        public Deposit(Account account, double amount) {
            this.account = account;
            this.amount = amount;
        }

        @Override
        public void execute() {
            account.deposit(amount);
        }

        @Override
        public String getTransactionDetails() {
            return "Deposit of " + amount + " to " + account.getAccountType();
        }
    }

    // Implement the Withdrawal class
    static class Withdrawal implements Transaction {
        private Account account;
        private double amount;

        public Withdrawal(Account account, double amount) {
            this.account = account;
            this.amount = amount;
        }

        @Override
        public void execute() {
            account.withdraw(amount);
        }

        @Override
        public String getTransactionDetails() {
            return "Withdrawal of " + amount + " from " + account.getAccountType();
        }
    }

    // Main method to run the banking system
    public static void main(String[] args) {
        // Create accounts
        Account savings = new SavingsAccount(1000.00);
        Account checking = new CheckingAccount(500.00);

        // Create transactions
        Transaction deposit1 = new Deposit(savings, 200.00);
        Transaction withdrawal1 = new Withdrawal(checking, 100.00);

        // Execute transactions
        deposit1.execute();
        withdrawal1.execute();

        // Print account balances and transaction details
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Checking Account Balance: $" + checking.getBalance());

        System.out.println(deposit1.getTransactionDetails());
        System.out.println(withdrawal1.getTransactionDetails());
    }
}