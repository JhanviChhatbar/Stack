import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        Map<Integer, Long> hashMap = new HashMap<>();
//
//        hashMap.put(1, 345678l);
//        hashMap.put(5, 234576l);
//        hashMap.put(2, 456789l);
//
//        for(Map.Entry entry : hashMap.entrySet()){
//            System.out.println("Account Id is " + entry.getKey() + " Account number is " + entry.getValue());
//        }

//        List<String> list = new ArrayList<>();
//        list.add("HDFC");
//        list.add("JP Morgan");
//        list.add("SBI");
//
//        List<String> filteredList = list.stream().filter(l -> l.startsWith("J")).collect(Collectors.toList());
//        System.out.println(filteredList.toString());
//
//        List<String> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("Sorted List " + sortedList.toString());

//        FunctionalInterface functionalInterface = (int a, int b) -> (a+b);
//
//        int i=10;
//        int j=20;
//
//        int sum = functionalInterface.add(i,j);
//        System.out.println("Sum " + sum);

        String s = "Java";

        Set<Character> charSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            boolean status = charSet.add(s.charAt(i));
            if(!status){
                System.out.println(s.charAt(i) + " ");
            }
        }
    }

}

interface FunctionalInterface{

    public abstract int add(int a, int b);
}