public class BrokenChessboard {
    public static int minimumFixes(String[] board){
        int n = board[0].length();
        int m = board.length;
        int result = 0;

        String[] board0 = new String[m];
        for(int i=0; i<m; i++){
            board0[i] = "";
        }
        String[] board1 = new String[m];
        for(int i=0; i<m; i++){
            board1[i] = "";
        }
        boolean wn = false;
        boolean wm = false;


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(wn == false){
                    board0[i] = board0[i]+"B";
                    wn = true;
                }
                else {
                    board0[i] = board0[i] + "W";
                    wn = false;
                }
                }

            if(wm){
                wm = false;
                wn = false;
            }
            else {
                wm = true;
                wn = true;
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(wn == false){
                    board1[i] = board1[i]+"W";
                    wn = true;
                }
                else {
                    board1[i] = board1[i] + "B";
                    wn = false;
                }
            }

            if(wm){
                wm = false;
                wn = false;
            }
            else {
                wm = true;
                wn = true;
            }
        }

        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i].charAt(j) != board0[i].charAt(j)){
                    count0++;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i].charAt(j) != board1[i].charAt(j)){
                    count1++;
                }
            }
        }

        result = Math.min(count0, count1);

//        for (int i=0; i<m; i++)
//        System.out.println(board0[i]);
        return result;
    }
}
