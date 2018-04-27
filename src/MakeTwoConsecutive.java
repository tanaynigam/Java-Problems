public class MakeTwoConsecutive {
    public static String solve(String S){
        String result = "Possible";
        if(S.length() == 0 || S.length() == 1)
            return "Impossible";

        if(S.length() == 2)
                return "Impossible";


        for(int i=0; i<S.length()-2; i++){
            if(S.charAt(i) == S.charAt(i+1) || S.charAt(i) == S.charAt(i+2))
                return "Possible";
        }

        if(S.charAt(S.length()-2) == S.charAt(S.length()-1))
            return "Possible";
        return "Impossible";
    }
}
