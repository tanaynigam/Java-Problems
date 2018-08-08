public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        for(int k=0; k<nums1.length + nums2.length; k++){
            if(i == nums1.length){
                nums3[k] = nums2[j];
                j++;
                continue;
            }

            if(j == nums2.length){
                nums3[k] = nums1[i];
                i++;
                continue;
            }

            if(nums1[i] <= nums2[j]){
                nums3[k] = nums1[i];
                i++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
            }
        }
        int len = nums3.length;
        double median = 0;

        if((len)%2 == 0)
            median = ((double) nums3[(len/2)-1] + (double) nums3[(len/2)]) / 2;
        else
            median = ((double) nums3[len/2]);

        return median;

    }
}
