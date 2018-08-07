import java.util.HashMap;

public class SmallestPositiveInteger {
    //Given array smallest positive integer not in the array

    public static int SmallestPosInt(int[] arr){
        HashMap<Integer, Integer> hashmap = new HashMap();

        for(int i=0; i< arr.length; i++){
            hashmap.put(arr[i], i);
        }

        for(int i =1; i<=arr.length+1; i++){
            if(!hashmap.containsKey(i))
                return i;
        }

        return arr.length+1;

    }
}
