public class MinimizeAbsoluteDifferenceDiv2 {
    public static int[] findtriple(int x1, int x2, int x3){
        float X0 = (float) x1;
        float X1 = (float) x2;
        float X2 = (float) x3;
        float[] sol = new float[6];

        sol[0] = Math.abs((X0/X1)-X2);
        sol[1] = Math.abs((X0/X2)-X1);
        sol[2] = Math.abs((X1/X0)-X2);
        sol[3] = Math.abs((X1/X2)-X0);
        sol[4] = Math.abs((X2/X0)-X1);
        sol[5] = Math.abs((X2/X1)-X0);

        float result = sol[0];
        int temp = 0;

        for(int i=1; i<6; i++){
            if(sol[i] < result){
                System.out.println(result);
                result = sol[i];
                temp = i;
            }
        }

        int[] answer = {0, 1, 2};
        if(temp == 0) {
            int[] solution = {0, 1, 2};
            answer = solution;
        }
        else if(temp == 1) {
            int[] solution = {0, 2, 1};
            answer = solution;
        }
        else if(temp == 2) {
            int[] solution = {1, 0, 2};
            answer = solution;
        }
        else if(temp == 3) {
            int[] solution = {1, 2, 0};
            answer = solution;
        }
        else if(temp == 4) {
            int[] solution = {2, 0, 1};
            answer = solution;
        }
        else if(temp == 5) {
            int[] solution = {2, 1, 0};
            answer = solution;
        }
        else {
            int[] solution = {0, 1, 2};
            answer = solution;
        }

        return answer;
        }
    }

