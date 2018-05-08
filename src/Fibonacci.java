public class Fibonacci {

    private static int count0 = 0;
    private static int count1 = 0;

    public static int CountFibonacci(int n){

        int val = Fib(n);
        System.out.println(count0 + " " + count1);
        return val;
    }

    private static int Fib(int n){
        if(n == 0){
            count0++;
            return 1;
        }
        if(n==1){
            count1++;
            return 1;
        }

        return Fib(n-1) + Fib(n-2);
    }
}
