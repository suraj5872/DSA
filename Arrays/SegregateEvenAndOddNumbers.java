import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SegregateEvenAndOddNumbers {

    public static List<Integer> moveEvenNumbers(List<Integer> numList){

        List<Integer> result = new ArrayList<>(numList);
        int n = result.size();
        int i=0, j = n-1;
        while(i < j){
            if (result.get(i) % 2 ==0 ){
                i++;
            }
            else if (result.get(j) % 2 !=0 ) {
                j--;
            }
            else{
                int temp = result.get(i);
                result.set(i, result.get(j));
                result.set(j, temp);
                i++;
                j--;
            }
        }
        return result;
    }
    public static List<Integer> usingStreams(List<Integer> numList) {
        Map<Boolean, List<Integer>> partitioned = numList.stream()
                .sorted()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        return Stream.concat(
                        partitioned.get(true).stream(),
                        partitioned.get(false).stream())
                .toList();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,9,7,4,3,8,9,10,14,19,20,25,21);
        System.out.println(moveEvenNumbers(integerList));
        System.out.println(usingStreams(integerList));
    }
}

