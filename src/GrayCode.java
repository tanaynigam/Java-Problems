import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList();

        int len = (int) Math.pow(2, n);

        for(int i=0; i<len; i++)
            list.add(i);

        list = Swap(list, len, false);

        for(int i=0; i<len; i++)
            System.out.print(list.get(i));


        return list;
    }

    public static List<Integer> Swap(List<Integer> list, int n, boolean check) {
        if (n == 4 && check == true) {
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);
            int d = list.get(3);
            List<Integer> ret = new ArrayList<>();
            ret.add(a);
            ret.add(b);
            ret.add(d);
            ret.add(c);
            return ret;
        }
        if (n ==4 && check == false){
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);
            int d = list.get(3);
            List<Integer> ret = new ArrayList<>();
            ret.add(c);
            ret.add(d);
            ret.add(b);
            ret.add(a);
            return ret;
        }
        if(n==2 && check == false) {
            int a = list.get(0);
            int b = list.get(1);
            List<Integer> ret = new ArrayList<>();
            ret.add(b);
            ret.add(a);
            return ret;
        }
        if(n == 2 && check == true)
            return list;

        List < Integer > list1 = new ArrayList();
        //List < Integer > list2 = new ArrayList();
        List < Integer > list3 = new ArrayList();
        List < Integer > list4 = new ArrayList();


        for (int i = 0; i < n / 2; i++)
            list1.add(list.get(i));

        for (int i= n / 2; i< (3*n/4); i++)
            list3.add(list.get(i));

        for (int i=(3*n/4); i<n; i++)
            list4.add(list.get(i));




        List<Integer> ret = new ArrayList<>();

        list1 = Swap(list1, n/2, true);
        list3 = Swap(list3, n/4, false);
        list4 = Swap(list4, n/4, true);

        for(int i=0; i<n/2; i++){
            ret.add(list1.get(i));
        }


        for(int i=0; i<n/4; i++){
            ret.add(list4.get(i));
        }

        for(int i=0; i<n/4; i++){
            ret.add(list3.get(i));
        }




        return ret;
    }
}
