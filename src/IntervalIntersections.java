public class IntervalIntersections {
    public static int minLength(int x1, int y1, int x2, int y2){

        if(x1 <= x2){
            if(y1 <= x2){
                return x2-y1;
            }
            else if(y1 >= x2 && y1 <= y2){
                return y1-x2;
            }
            else if(y1 >= y2){
                return 0;
            }
        }
        else if (x1 >= x2){
            if(y2 <= x1){
                return x1 - y2;
            }
            else if(y2 >= x1 && y2 <= y1){
                return y2-x1;
            }
            else if(y2 >= y1){
                return 0;
            }
        }

        return 0;
    }
}
