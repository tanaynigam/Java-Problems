import java.util.ArrayList;

public class StringCombination {
static int count = 0;

    public static void main(String[] args){
        ArrayList<String> res = StringCombination.FindPerm("abcdefg");
        for(int i=0; i<res.size(); i++)
            System.out.println(res.get(i));
        System.out.println(count);

    }

    public static ArrayList<String> FindPerm(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str.length() == 1) {
            res.add(str);
            count++;
            return res;
        }

        for (int i = 0; i < str.length(); i++) {
            String str2 = str.substring(i, i + 1);
            String str3 = str;
            str3 = str.replace(str.substring(i, i + 1), "");
            ArrayList<String> str_arr = FindPerm(str3);
            for (int j = 0; j < str_arr.size(); j++) {
                count++;
                res.add(str2 + str_arr.get(j));
            }

        }

        return res;
    }
}
