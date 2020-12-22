package objectOrientedPrograming;

public class LoanAccount implements IRate{

    // Interface Methods
    public void setRate(){
        System.out.println("SETTING RATE of loan");
    }
    public void increaseRate(){
        System.out.println("INCREASING RATE of loan");
    }

    public void setTerm(int terms){
        System.out.println("setting the term to: " + terms + " years");
    }

    public void setAmmortSched(){
        System.out.println("Amortization schedule");
    }
}
