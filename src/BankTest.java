public class BankTest {
    public static void main(String[] args){

        BankAccount riti1 = new BankAccount();
        BankAccount riti2 = new BankAccount();
        BankAccount riti3 = new BankAccount();


        riti1.depositChecking(500);
        riti1.depositSaving(200);

        riti2.depositChecking(200);
        riti2.depositSaving(500);

        riti3.depositChecking(300);
        riti3.depositSaving(300);


        System.out.println(riti1.getCheckingBalance());
        System.out.println(riti1.getSavingsBalance());

        System.out.println(riti2.getCheckingBalance());
        System.out.println(riti2.getSavingsBalance());

        System.out.println(riti3.getCheckingBalance());
        System.out.println(riti3.getSavingsBalance());


        riti1.withdrawChecking(50);
        riti1.withdrawSaving(20);

        riti2.withdrawChecking(50);
        riti2.withdrawSaving(20);

        riti3.withdrawChecking(700);
        riti3.withdrawSaving(500);

        System.out.println(riti1.totalBalance());
        System.out.println(riti2.totalBalance());
        System.out.println(riti3.totalBalance());

        System.out.println(BankAccount.getAccounts());

        System.out.println(BankAccount.getTotalMoney());





        // Create 3 bank accounts
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)

    }

}
