public class IncreasingSequencesEasy {
    public static int count(int[] L, int[] R){
        int[] count = new int[L.length];
        int mod = 998244353;

        for(int i=0; i<L.length-1; i++){
            if(R[i+1] < L[i])
                return 0;
            count[i] = L[i] - R[i] + 1;
        }
        count[L.length-1] = L[L.length-1] - R[L.length-1];
        int comb = 1;

        for(int i=0; i<L.length-1; i+=2){
            if(L[i+1] > R[i] ) {
                comb = comb * count[i] * count[i + 1] % mod;
                continue;
            }
            else if(L[i+1] < R[i]){
                comb = comb * (Perm(count[i], count[i+1] - (R[i] - L[i+1]) ) + Perm(count[i] - (R[i] - L[i+1]), count[i+1]));
            }



        }



        return 0;
    }

    public static int Perm(int m, int n){
// m*n!/(m*n-2!)(2!)
        return 0;
    }
}
