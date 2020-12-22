package objectOrientedPrograming;

public class AccountApp {
    public static void main(String[] args) {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.increaseRate();
        loanAccount.setRate();
        loanAccount.setAmmortSched();
        loanAccount.setTerm(20);

        // Polymorphism changes where we are pointing
        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();
    }
}
