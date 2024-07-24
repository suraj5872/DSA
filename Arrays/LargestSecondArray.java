import java.util.Arrays;
import java.util.List;

public class LargestSecondArray
{

    public static int print2largest(List<Integer> arr) {
        if (arr.isEmpty() || arr.size() < 2) {
            return -1;
        }

        // Use a Set to track distinct elements
        //Set<Integer> distinctElements = new HashSet<>();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        // If we don't have a valid second largest element
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,3,0,2,0,7);
        System.out.println(print2largest(list));
    }
}