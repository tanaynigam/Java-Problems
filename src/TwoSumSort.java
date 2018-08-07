import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class TwoSumSort {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = (nums.length)-1;
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int k=0; k<nums.length; k++)
            list.add(nums[k]);


        Arrays.sort(nums);

        while(i<j){
            if(nums[i] + nums[j] > target){
                j--;
            }
            else if(nums[i] + nums[j] < target){
                i++;
            }
            else {
                int[] sol = new int[2];
                sol[0] = list.indexOf(nums[i]);
                sol[1] = list.lastIndexOf(nums[j]);
                return sol;
            }
        }

        return null;
    }
}
