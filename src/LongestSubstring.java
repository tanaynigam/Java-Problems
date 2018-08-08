import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int max = 1;
        HashSet<Character> map = new HashSet();
        int i=0;
        int j=1;
        map.add(s.charAt(i));
        while (j<s.length()){
            if(i==j){
                j++;
                continue;
            }

            if(map.contains(s.charAt(j))){
                if(max < j-i)
                    max = j-i;
                map.remove(s.charAt(i));
                i++;
                if(!map.contains(s.charAt(j))){
                    map.add(s.charAt(j));
                    j++;
                }

            }
            else {
                map.add(s.charAt(j));
                j++;
                if(max < j-i)
                    max = j-i;
            }

        }
        return max;
    }
}
