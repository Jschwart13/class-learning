package basics;

public class NumbersCalc {

    public static void main(String[] args) {
        System.out.println("Program is starting:");
        printName();
        int a = 10;
        int b = 20;
        addNumbers(a, b);
        int product = multiplyNumbers(a,b);
        System.out.println("The product of a and b = " + product);
    }

    static void printName(){
        System.out.println("My name is Joel");
    }

    static void addNumbers(int numberA, int numberB){
        // This function will add 2 numbers
        int sum = numberA + numberB;
        System.out.println("The sum of a and b = " + sum);
    }

    static int multiplyNumbers(int numberA, int numberB){
        // This function will multiply 2 numbers
        int product = numberA * numberB;
        addNumbers(product, product);
        return product;
    }



}
