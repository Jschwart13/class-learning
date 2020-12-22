package labs;

public class AssignmentOne {
    // Write a function that takes a value n returs the sum of the numbers 1 to n

    public static void main(String[] args) {
        int n = 5;
        addOne(n);

        System.out.println("-------------------");

        System.out.println(factorial(n));

        System.out.println("-------------------");

        int [] randomNumbers = {5, -2, 0, 234, -428, 63};
        System.out.println(min(randomNumbers));
        System.out.println(max(randomNumbers));
        System.out.println(avg(randomNumbers));

    }

    public static int addOne(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++){
            System.out.print(sum + " + " + i);
            sum = sum +i;
            System.out.println(" = " + sum);
        }
        return sum;
    }

    public static int factorial(int n){
        if (n ==0){
            return  1;
        }
        else if (n==1){
            return  1;
        }
        return factorial(n-1)*n;
    }

    public static int min(int[] a){
        int min = a[0];
        for (int i = 0; i<a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static int avg(int[] a){
        int sum = 0;
        int answer;
        for (int i=0; i<a.length; i++){
            sum = a[i] + sum;
        }
        answer = sum/a.length;
        return answer;
    }

    public static int max(int[] a){
        int max = a[0];
        for (int i = 0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}