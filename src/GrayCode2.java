import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrayCode2 {
    public static List<Integer> grayCode2(int n){
        List<Integer> list = new ArrayList<>();
        int pow = 0;

        list.add(0);

        for(int i=1; i<(Math.pow(2, n)); i++ ){
            int temp = list.get(i-1);

            if((i) % Math.pow(2, pow) == 0){
                pow++;
                i--;
                continue;
            }else {

                temp = toggleBit(temp, pow - 1);
                pow = 0;
                list.add(temp);
            }

        }

        for (int i =0 ; i< list.size(); i++)
            System.out.print(list.get(i) + " ");

        return list;
    }


    static int toggleBit(int n, int k){
        return (n ^ (1<< k));
    }
}
