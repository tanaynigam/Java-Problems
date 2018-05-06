public class LongMansionDiv2 {
    public static long minimalTime(int M, int[] t){
        int N = t.length;
        int min = t[0];
        int mid = 0;
        for(int i=0; i<N; i++){
            if(t[i] < min) {
                min = t[i];
                mid = i;
            }
        }

        long Total_time = 0;
        for (int i=0; i<mid; i++){
            Total_time += t[i];
        }

        for(int j=0; j<M; j++){
            Total_time+=t[mid];
        }

        for (int i=mid+1; i<N; i++){
            Total_time+=t[i];
        }


        return Total_time;
    }
}
