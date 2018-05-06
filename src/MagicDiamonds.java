public class MagicDiamonds {
    public static long minimalTransfer(long n){
        boolean isPrime = CheckPrime(n);

        if (isPrime == true){
            if(n> 3)
                return 2;
            else
                return n;
        }
        else
            return 1;

    }

    private static boolean CheckPrime(long n){
        if(n%2 == 0)
            return false;

        for (long i=3; i<Math.sqrt(n); i+=2){
            if(n%i == 0)
                return false;
        }

        return true;
    }
}
