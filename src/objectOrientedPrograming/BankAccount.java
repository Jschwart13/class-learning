package objectOrientedPrograming;

public class BankAccount implements IRate {
    // Define variables
    String accountNumber;

    // static >> belongs to the class and not the object instance
    // final >> constant (often static final)
    private static final String routingNumber = "rout123";

    // instance variables
    private String name;
    private String ssn;
    String accountType;
    double balance;

    // Constructor Definitions >> these are unique methods
        // 1. Used to define, setup, initialize properties of an object
        // 2. Constructors are implicitly called upon instantiation
        // 3. The same name as the class itself
        // 4. Constructors have no return type at all
    BankAccount(){
        System.out.println("New Account Created");
    }
    // Overloading: call the same method name with different arguments
    BankAccount(String accountType){
        System.out.println("New Account: " + accountType);
    }
    BankAccount(String accountType, double initDeposit){
        // initDeposit, accountType, message are all local variables
        System.out.println("New Account: " + accountType);
        System.out.println("Initial Deposit of: " + initDeposit);
        String message = null;
        if (initDeposit<1000){
            message = "ERROR: Min deposit has to be at least $1,000";
        }else{
            message = "Thanks for your initial deposit of: $" + initDeposit;
        }
        System.out.println(message);
        balance = balance + initDeposit;
    }

    // Getters & Setters
        // Allow the user to define the name
    public void setName(String name){
        this.name = "Mr." + name;
    }
    public String getName(){
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Interface Methods
    public void setRate(){
        System.out.println("SETTING RATE");
    }
    public void increaseRate(){
        System.out.println("INCREASING RATE");
    }

    // Define Methods
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount){
        balance = balance + amount;
        showActivity("WITHDRAW");
    }

    // private can only be called from within class
    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: " + balance);
    }

    void checkBalance(){
        System.out.println("balance is: " + balance);
    }

    void getStatus(){

    }

    // Overrides
    @Override
    public String toString(){
        return "[ NAME: " + name + ", ACCOUNT NUMBER: " + accountNumber + ", ROUTING NUMBER: " + routingNumber + " BALANCE: $" + balance + " ]";
    }
}
