import java.util.ArrayList;
import java.util.Arrays;

public class CollectingRiders {
    public static void main(String[] args){
        String[] board = 	{"9133632343", "5286698232", "8329333369", "5425579782", "4465864375", "8192124686", "3191624314", "5198496853", "1638163997", "6457337215"};
        System.out.println(minimalMoves(board));

    }

    public static int minimalMoves(String[] board) {
        int[][] moves = new int[][]{{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        for (int i=0; i< moves.length; i++){
            for (int j=0; j<moves[0].length; j++)
                System.out.print(moves[i][j]);
            System.out.println();
        }

            int ans = -1;
            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board[0].length(); ++j) {
                    ArrayList<Integer> stack = new ArrayList<Integer>();
                    int[][] t = new int[board.length][board[0].length()];
                    for (int k = 0; k < t.length; ++k) {
                        Arrays.fill(t[k], Integer.MAX_VALUE);
                    }

                    t[i][j] = 0;
                    stack.add(i * 11 + j);
                    while (stack.size() > 0) {
                        int x = stack.get(stack.size() - 1) / 11;
                        int y = stack.remove(stack.size() - 1) % 11;
                        for (int k = 0; k < moves.length; ++k) {
                            if (x + moves[k][0] >= 0 && x + moves[k][0] < t.length && y + moves[k][1] >= 0 && y + moves[k][1] < t[0].length && t[x + moves[k][0]][y + moves[k][1]] > t[x][y] + 1) {
                                t[x + moves[k][0]][y + moves[k][1]] = t[x][y] + 1;
                                stack.add((x + moves[k][0]) * 11 + y + moves[k][1]);
                                System.out.println(x+moves[k][0] * 11 + y + moves[k][1]);
                            }
                        }
                    }
                    int cnt = 0;
                    for (int x = 0; x < t.length; ++x) {
                        for (int y = 0; y < t[0].length; ++y) {
                            if (board[x].charAt(y) != '.') {
                                if (t[x][y] == Integer.MAX_VALUE) {
                                    cnt = -1;
                                    break;
                                } else {
                                    cnt += (t[x][y] + (int) (board[x].charAt(y) - '0') - 1) / ((int) (board[x].charAt(y) - '0'));
                                }
                            }
                        }
                        if (cnt == -1) {
                            break;
                        }
                    }
                    if ((cnt != -1 && cnt < ans) || ans == -1) {
                        ans = cnt;
                    }
                }
            }
            return ans;
        }
    }
