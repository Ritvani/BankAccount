public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    public BankAccount(){
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        accounts++;
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public void depositChecking(double amount){
        checkingBalance += amount;
    }

    public void depositSaving(double amount){
        savingsBalance +=amount;
    }


    public void withdrawChecking(double amount){
        if (checkingBalance<amount) {
            System.out.println("You don't have enough balance");
        } else
            checkingBalance -= amount;
    }

    public void withdrawSaving(double amount){
        if (savingsBalance<amount) {
            System.out.println("You don't have enough balance");
        } else {
            savingsBalance -= amount;
        }
    }

    public double totalBalance(){
        return totalMoney = checkingBalance + savingsBalance;
    }











    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
