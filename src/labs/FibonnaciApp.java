package labs;

public class FibonnaciApp {
    public static void main(String[] args) {
        // Fibonnaci number is the sum of the 2 previous Fibonnaci numbers
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(1) + fib(0)
        // fib(3) = fib(2) + fib(1)
        // etc...

        System.out.println(fibonnaci(0));
        System.out.println(fibonnaci(1));
        System.out.println(fibonnaci(2));
        System.out.println(fibonnaci(3));
        System.out.println(fibonnaci(4));
        System.out.println(fibonnaci(5));

        System.out.println("--------------------");

        int x;
        int n = 20;
        for (x = 0; x<=n; x++){
            System.out.println(fibonnaci(x));
        }
    }

    public static int fibonnaci(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
