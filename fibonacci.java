public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series of n numbers");
        int n = x; // Change n to the desired Fibonacci sequence length
        for (int i0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
