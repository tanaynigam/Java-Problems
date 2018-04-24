import java.util.ArrayList;

public class QuickSort {
    public static void Sort_Quick(int[] array){


        ArrayList<Integer> arr = new ArrayList();

        for(int i=0; i<array.length; i++)
            arr.add(array[i]);

        arr = QuickSort(arr);

        System.out.println(arr);

    }


    private static ArrayList<Integer> QuickSort(ArrayList<Integer> arr){
        if(arr.size() < 2)
            return arr;

        int n = arr.size()/2;
        System.out.println(n);
        int mid = arr.get(n);
        ArrayList<Integer> left = new ArrayList();
        ArrayList<Integer> right = new ArrayList();

        for(int i=0; i<arr.size(); i++){
            if(i != n) {
                if (arr.get(i) <= mid) {
                    left.add(arr.get(i));
                } else if (arr.get(i) > mid) {
                    right.add(arr.get(i));
                }
            }
        }

        ArrayList<Integer> new_arr = new ArrayList();

        //ArrayList<Integer> new_left = QuickSort(left);
        //ArrayList<Integer> new_right = QuickSort(right);

        new_arr.addAll(QuickSort(left));
        new_arr.add(mid);
        new_arr.addAll(QuickSort(right));

        System.out.println(new_arr);
        return new_arr;
    }
}
