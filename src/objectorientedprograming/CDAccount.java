package objectorientedprograming;

public class CDAccount extends BankAccount implements IRate {

    double interestRate;

    void compound(){
        System.out.println("Compounding Interest");
    }

}
