package in.mgp.p.crackingcode.recursion;

public class Fibonacci {
    // foibonacco series 0 1 1 2 3 5 8

    public static void main(String[] args) {
        int n =12;

        System.out.println(fibonacci(n));
    }

    private static int fibonacci (int n ){
        if( n <= 1) {
            return n;

        }else {

            return fibonacci(n-1)+ fibonacci(n-2);
        }

    }
}
