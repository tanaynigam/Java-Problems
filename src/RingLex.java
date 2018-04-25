public class RingLex {
    public static String getmin(String s){

        int n = s.length();
        int p = FindBiggestPrime(s.length()-1);
        System.out.println(p);
        char min = s.charAt(0);
        int index = 0;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)< min){
                min = s.charAt(i);
                index = i;
            }
        }

        String result = ""+ min;

        for(int i=1; i<n; i++){
            if(index + p < n){
                result = result + s.charAt(index+p);
                index = index+p;
            }
            else {
                result = result + s.charAt(index+p-n);
                index = index + p - n;
            }
        }

        return result;
    }

    private static int FindBiggestPrime(int n){

        if(n == 2)
            return 2;

        for(int i=2; i<n; i++){
            if(n%i == 0)
                return n;
        }


        return FindBiggestPrime(n-1);
    }
}
