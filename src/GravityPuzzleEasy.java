public class GravityPuzzleEasy {
    public static String[] solve(String[] board){
        int[] count = new int[board[0].length()];

        for(int j=0; j<board[0].length(); j++){
            count[j] = 0;
            for(int i=board.length-1; i>=0; i--){
                if(board[i].charAt(j) == '#'){
                    count[j]++;
                }
            }
        }

        String[] result = new String[board.length];
        for(int i=0; i<board.length; i++) {
            result[i] = "";
        }

        for(int j=0; j<board[0].length(); j++){
            for(int i=board.length-1; i>=0; i--){
                if(count[j] > 0) {
                    result[i] = result[i] + "#";
                    count[j]--;
                }
                else
                    result[i] = result[i] + ".";
            }
        }

        return result;

    }
}
