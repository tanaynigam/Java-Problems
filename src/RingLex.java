import java.util.ArrayList;

public class RingLex {
    public static String getmin(String s){

        int n = s.length();
        int[] p = FindPrime(s.length());

        for (int i=0; i<p.length; i++)
            System.out.println(p[i]);

        ArrayList<String> sol = new ArrayList<>();
        char min = s.charAt(0);
        int index = 0;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)< min){
                min = s.charAt(i);
                index = i;
            }
        }

        String result = ""+ min;

        for(int j=0; j<p.length; j++) {
            for (int i = 1; i < n; i++) {
                if (index + p[j] < (n-1)) {
                    result = result + s.charAt(index + p[j]);
                    index = index + p[j];
                } else {
                    result = result + s.charAt(index + p[j] - (n-1));
                    index = index + p[j] - (n-1);
                }
            }
            sol.add(result);
            result = ""+min;
        }
        for(int i=0; i<sol.size(); i++)
            System.out.println(sol.get(i));

        String lex = sol.get(0);
        for(int i=1; i<sol.size(); i++){
            if(lex.compareTo(sol.get(i))>0)
                lex = sol.get(i);
        }



        return lex;
    }

    private static int[] FindPrime(int n){

        ArrayList<Integer> p = new ArrayList<>();

            for(int i= 2; i<n; i++) {
                if(i == 2 ) {
                    p.add(2);
                    continue;
                }
                boolean prime  = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }else
                        continue;
                }

                if (prime == true)
                    p.add(i);

            }

            int[] prime_no = new int[p.size()];
            int count = 0;

            for (int i=0; i<p.size(); i++) {
                prime_no[count] = p.get(i);
                count++;
            }


        return prime_no;
    }
}
