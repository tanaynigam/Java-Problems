//public class EmoticonsDiv2 {
////    public static int printSmiles(int smiles){
////
////
//////        int time = 0;
//////        int i = 1;
//////        while(i<smiles/2){
//////            if(2*i>smiles/2)
//////                break;
//////            i = 2*i;
//////            time+=2;
//////        }
//////
//////        if(i==smiles/2)
//////            return time+2;
//////        else
//////            return time + (smiles/2);
////        return TimeTaken(smiles);
////    }
////
////    static int TimeTaken(int n){
////        if(Prime(n))
////            return n+1;
////
////        int smallestPrimeDiv = SmallestPrimeDive(n);
////        int BiggestDivisor = n/smallestPrimeDiv;
////
////        return TimeTaken(BiggestDivisor)+smallestPrimeDiv+1;
////    }
////
////    static boolean Prime(int n){
////        if(n == 2 || n == 3)
////            return true;
////        for(int i=2; i<Math.sqrt(n); i++){
////            if(n%i == 0)
////                return false;
////        }
////
////        return true;
////    }
////
////    static int SmallestPrimeDive(int n){
////        for(int i=2; i<Math.sqrt(n); i++){
////            if(n%i == 0)
////                return i;
////        }
////        return n;
////    }
//}

public class EmoticonsDiv2 {
    public static int printSmiles(int smiles) {
        int actions=2,len=2,copy=1;
        smiles-=2;
        while(smiles>0) {
            if(smiles%len==0)
            {
                copy=len;
                smiles-=copy;
                len+=copy;
                actions+=2;
            } else
            {
                smiles-=copy;
                len+=copy;
                actions++;
            }
            System.out.println(smiles);
        }
        return actions;
    }
}