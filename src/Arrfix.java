import java.util.LinkedList;
import java.util.Stack;

public class Arrfix {
    public static int mindiff(int[] A, int[] B, int[] F){

        LinkedList<Integer> A_arr = new LinkedList<>();
        LinkedList<Integer> B_arr = new LinkedList<>();
        LinkedList<Integer> discarded = new LinkedList<>();

        Stack<Integer> Extra = new Stack<>();

        for(int i=0; i<A.length; i++){
            A_arr.add(A[i]);
            B_arr.add(B[i]);
        }

        for(int i=0; i<A_arr.size(); i++){
            if (A_arr.get(i).equals(B_arr.get(i))){
                discarded.add(A_arr.get(i));
                A_arr.remove(i);
                B_arr.remove(i);
                i--;
            }
        }


        for (int i=0; i<F.length; i++){
            if(B_arr.contains(F[i])) {
                A_arr.remove(B_arr.indexOf(F[i]));
                B_arr.remove(B_arr.indexOf(F[i]));
            }
            else if(discarded.contains(F[i])) {
                int n = discarded.indexOf(F[i]);
                discarded.remove(n);
            }
            else
                Extra.push(F[i]);
        }

        int count = Extra.size() + A_arr.size();

        return count;
    }
}
