import java.util.Arrays;
import java.util.Stack;

public class FindingSpanUsingStack {

    public static int[] findingSpans(int[] inputArray){
        int[] spans = new int[inputArray.length];
        Stack stack = new Stack();
        stack.push(0);
        spans[0] = 1;

        for(int i=1; i < inputArray.length; i++){
            while(!stack.empty() && inputArray[i] > inputArray[(Integer)stack.peek()])
                stack.pop();

            if(stack.isEmpty())
                spans[i] = i+1;
            else
                spans[i] = i- (Integer) stack.peek();

            stack.push(i);
        }
        return spans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findingSpans(new int[]{10, 40, 50, 90, 120, 80})));
    }
}
