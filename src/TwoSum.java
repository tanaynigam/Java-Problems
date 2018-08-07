import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int[] sol = new int[2];
                sol[0] = i;
                sol[1] = map.get(target-nums[i]);
                if(sol[0] != sol[1])
                    return sol;
            }
            else{
                map.put(nums[i], i);
            }
        }

        int[] sol = {-1, -1};
        return sol;
    }

}
