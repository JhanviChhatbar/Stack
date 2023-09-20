import java.util.Arrays;

public class FindingSpans {

    public static int[] findingSpans(int[] inputArray){
       int[] spans = new int[inputArray.length];

       for(int i=0; i< inputArray.length; i++){
           int span = 1;
           int j = i-1;
           while(j >=0 && inputArray[j] <= inputArray[j+1]){
               span++;
               j--;
           }
           spans[i] = span;
       }
       return spans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findingSpans(new int[]{10, 4, 5, 90, 120, 80})));
    }
}
