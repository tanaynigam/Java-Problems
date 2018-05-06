import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ErdosNumber {

    static ArrayList<String> Scientist_Names = new ArrayList<>();
    static ArrayList<Integer> ErdosNumber = new ArrayList<>();
    static LinkedList<String> queue = new LinkedList<>();
    public static String[] calculateNumbers(String[] publications){
        Scientist_Names.add("Erdos");
        ErdosNumber.add(0);
        queue.add("Erdos");

        UpdateErdosNumber("Erdos", publications);

        for(int i=0; i<Scientist_Names.size(); i++)
            System.out.println(Scientist_Names.get(i));

        for(int i=0; i<ErdosNumber.size(); i++)
            System.out.println(ErdosNumber.get(i));



        String[] str = {""};
        return str;
    }

    public static void UpdateErdosNumber(String ScientistName, String[] publications){

        int ScientistErdosNumber = ErdosNumber.get(Scientist_Names.indexOf(ScientistName));
        for (int i=0; i< publications.length; i++){
            if(publications[i].indexOf(ScientistName)>=0){
                System.out.println(publications[i]);
                String[] names = publications[i].split(" ");

                for(String a : names){
                    System.out.println(a);
                    if(Scientist_Names.contains(a)){
                        continue;
                    }
                    else {
                        Scientist_Names.add(a);
                        ErdosNumber.add(ScientistErdosNumber+1);
                        queue.add(a);
                    }
                }
            }
        }

        while(!queue.isEmpty())
            UpdateErdosNumber(queue.poll(), publications);


    }
}
