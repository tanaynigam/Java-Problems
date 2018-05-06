public class HandsShaking {
    public static long countPerfect(int n){
        long result = 2;
        int m = n/2;

        if ( m == 1)
            return 1;

        int temp = m;

        for(int i=3; i<=m; i++){
            result = result + temp;
            temp = 2*temp;
        }

        return result;
    }
}
