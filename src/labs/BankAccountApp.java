package labs;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", 1000);
//        BankAccount account2 = new BankAccount("234567890", 2000);
//        BankAccount account3 = new BankAccount("345678901", 3000);

        account1.setName("Jim");
        System.out.println("your name is: " + account1.getName());
        account1.makeDeposit(4000);
        account1.makeDeposit(2500);
        account1.payBill(3500);
        account1.accrue();
        account1.showBalance();
        System.out.println(account1.toString());
    }
}

class BankAccount implements IInterest{
    // Properties
    private static int id = 1000;
    private String accountNumber; //id + random 2 digit number + first 2 of ssn
    private static final String routingNumber = "009399485";
    private String name;
    private String ssn;
    private double balance;

    // Constructors
    public BankAccount(String ssn, double initialDeposit){
        balance = initialDeposit;
        this.ssn = ssn;
        id++;
        setAccountNumber();
        showBalance();
    }

    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = id + "" + random + "" + ssn.substring(0,2);
        System.out.println("your account number is: " + accountNumber);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount){
        balance = balance - amount;
        System.out.println("you are paying: " + amount);
        showBalance();
    }

    public void makeDeposit(double amount){
        balance = balance + amount;
        System.out.println("you are depositing: " + amount);
        showBalance();
    }

    public void showBalance(){
        System.out.println("your balance is " + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        System.out.println("You have accrued some interest!");
    }

    @Override
    public String toString(){
        return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
    }
}
