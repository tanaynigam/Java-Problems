import java.util.Stack;

public class BoardSplitting {
    int minimumCuts(int desiredLength, int desiredCount, int actualLength){
        int numberOfCuts = 0;
        int remainingLength;

        if(desiredLength > actualLength){
            remainingLength = desiredLength%actualLength;

            for (int i=0; i<desiredCount; i++){
                Stack<Integer> stack = new Stack<>();

                if(!stack.empty()){
                    if (stack.peek() == remainingLength){
                        continue;
                    }
                    else if(stack.peek() > remainingLength){
                        int temp = stack.pop();
                        stack.push(temp - remainingLength);
                        numberOfCuts++;
                        continue;
                    }
                    else if(stack.peek() < remainingLength){
                        int temp = stack.pop();
                        while (stack.peek() + temp < remainingLength){
                            temp = temp + stack.pop();
                        }
                    }
                }

            }

        }

        return 0;
    }
}
