import java.util.ArrayList;
import java.util.HashMap;

public class SortingGame {
    String tos(int[] b)
    {
        StringBuilder sb = new StringBuilder();
        for(int i : b) sb.append(i);
        return sb.toString();
    }
    boolean isZ(String s)
    {
        for(int i = 0; i < s.length()-1; i++)
            if(s.charAt(i) > s.charAt(i+1))
                return false;
        return true;
    }
    public int fewestMoves(int[] b, int k)
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<String>();
        String start = tos(b);
        list.add(start);
        map.put(start, 0);
        for(int i = 0; i < list.size(); i++)
        {
            String tmp = list.get(i);
            int val = map.get(tmp);
            if(isZ(tmp))
                return val;

            for(int j = 0; j <= tmp.length()-k; j++)
            {
                StringBuilder sb = new StringBuilder();
                sb.append(tmp.substring(j,j+k));
                String t = tmp.substring(0,j) + sb.reverse().toString() + tmp.substring(j+k);
                if(!map.containsKey(t))
                {
                    list.add(t);
                    map.put(t, val+1);
                }
            }
        }
        return -1;
    }
}
