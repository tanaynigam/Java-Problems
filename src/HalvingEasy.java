public class HalvingEasy {
    public static int count(int[] S, int T){
        int count = 0;

        for(int i=0; i<S.length; i++){
            double num = (double) S[i];
            if(num == T) {
                count++;
                continue;
            }

            while (num > T){
                num = Math.floor(num /2);

                if(num == T)
                    count++;
            }
        }


        return count;
    }
}
