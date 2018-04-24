import java.util.Arrays;

public class MergeSort {

    public static void Sort_Merge(int[] data){
        for(int i=0; i<data.length; i++)
            System.out.print(data[i]);
        data = mergeSort(data);

        System.out.println(data);
    }

    static int[] mergeSort (int[] data) {
        if (data.length < 2)
            return data;

        int middle = data.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(data, 0, middle - 1));
        int[] right = mergeSort(Arrays.copyOfRange(data, middle, data.length - 1));
        int[] result = new int[data.length];
        int dPtr = 0;
        int lPtr = 0;
        int rPtr = 0;
        while (dPtr < data.length) {
            if (lPtr == left.length) {
                result[dPtr] = right[rPtr];
                rPtr++;
            } else if (rPtr == right.length) {
                result[dPtr] = left[lPtr];
                lPtr++;
            } else if (left[lPtr] < right[rPtr]) {
                result[dPtr] = left[lPtr];
                lPtr++;
            } else {
                result[dPtr] = right[rPtr];
                rPtr++;
            }
            dPtr++;
        }
        return result;
    }
}
