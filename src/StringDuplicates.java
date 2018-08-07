import java.util.LinkedList;

public class StringDuplicates {

    public static String StrDup(String str){
        char[] chr = str.toCharArray();
        LinkedList<Character> linkedList = new LinkedList<>();

        for(int i=0; i<chr.length; i++){
            linkedList.add(chr[i]);
        }

        int i=0;

        while(i<linkedList.size()-1){
            if(linkedList.get(i).equals(linkedList.get(i+1))){
                linkedList.remove(i+1);
                linkedList.remove(i);
                i--;
                if(i<0)
                    i =0;
            }
            else {
                i++;
            }

        }

        String result = "";


        for(i=0; i<linkedList.size(); i++)
            result = result + linkedList.get(i);

        return result;
    }

}
