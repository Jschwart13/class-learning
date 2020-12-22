package objectorientedprograming;

public class BankAccountApp {
    public static void main(String[] args) {
        // Creating a new bank account >> think instantiate an object

        BankAccount account1 = new BankAccount();

        account1.accountNumber = "12121212";

//        account1.name = "Roger, Hue";
        // tome for some encapsulation: public api methods
        account1.setName("Roger, Hue");
        System.out.println(account1.getName());
        account1.setSsn("secretcode");
        System.out.println(account1.getSsn());

        account1.balance = 10000;

        account1.deposit(1500);
        account1.withdraw(2000);

        // Polymorphism through overriding
        System.out.println(account1.toString());



        // Polymorphism through overloading
        BankAccount account2 = new BankAccount("Checking Acount");
        account2.accountNumber = "23232323";

        BankAccount account3 = new BankAccount("Savings Acount", 5000);
        account3.accountNumber = "34343434";




  /*
          account3.checkBalance();

        // Demo for inheritence
        CDAccount cdAccount = new CDAccount();
        cdAccount.balance = 1000;
        cdAccount.interestRate = 4.5;
        cdAccount.name = "Schwartz, Joel";
        cdAccount.accountType = "CD Account";
        System.out.println(cdAccount.toString());
        cdAccount.compound();


         */
    }
}
