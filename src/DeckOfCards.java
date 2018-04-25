import java.util.HashSet;

public class DeckOfCards {
    public static String IsValid(int n, int[] value, String suit){

        String valid = "Perfect";
        for(int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(value[i] == value[j] && suit.charAt(i) == suit.charAt(j)) {
                    valid = "Not perfect";
                    return valid;
                }

            }
        }
        char[] ch = new char[suit.length()];
        for (int i=0; i< suit.length(); i++)
            ch[i] = suit.charAt(i);

        int count = 1;

        HashSet<Integer> Intdup = new HashSet<>();
        for(int i=0; i<n; i++)
            Intdup.add(value[i]);

        HashSet<Character> Chardup = new HashSet<>();
        for(int i=0; i<n; i++)
            Chardup.add(ch[i]);

        int uniqueChars = Chardup.size();
        //System.out.println(uniqueChars);
        int uniqueInts = Intdup.size();
        //System.out.println(uniqueInts);



        for(int i=0; i<n-1; i++){
            for(int j=0; j<n ;j++){
                if (value[i] == value[j] && suit.charAt(i) != suit.charAt(j))
                    count++;
            }
            //System.out.println(value[i] +" "+count + " " + uniqueChars);
            if (count != uniqueChars) {
                valid = "Not perfect";
                return valid;
            }
            count = 1;
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n ;j++){
                if (value[i] != value[j] && suit.charAt(i) == suit.charAt(j))
                    count++;
            }
            //System.out.println(count + " " + uniqueInts);
            if (count != uniqueInts) {
                valid = "Not perfect";
                return valid;
            }
            count = 1;
        }



        return valid;
    }


}
