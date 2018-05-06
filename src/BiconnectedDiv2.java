import java.util.Arrays;

public class BiconnectedDiv2 {
    public static int minimize(int[] w1, int[] w2){
        int n = w1.length+1;

        int Sum = 0;

        for(int i=0;  i<w2.length; i++) {
            Sum += w1[i];
            Sum += w2[i];
        }
        Sum += w1[w1.length-1];

        boolean[] removed = new boolean[w1.length];


        for(int i=0; i<n; i++){
            if(removed[i] == true){
                continue;
            }
            int newSum = FindSum(i, w1, w2, Sum);

            if (newSum < Sum){
                Sum = newSum;
                removed[i] = true;
                if (w1[i] > w2[i])
                    removed[i+1] = true;
                else
                    removed[i+2] = true;
            }
        }




        return Sum;
    }

    private static int FindSum(int num, int[] w1, int[] w2, int Sum){

        if(num > 0 && num<w1.length && num<w2.length) {
            int t1 = Math.max(w1[num], w2[num]);
            if(num+2<=w2.length)
                Sum = Sum - Math.max(t1, Math.max(w1[num+1], w2[num+2]));

        }
        return Sum;
    }
}
