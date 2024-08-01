public class MissingNumberInArray {
    static void getMissingNumberInArray(int[] a){
        int n = a.length;
        for (int i = 1; i <= n+1; i++) {
            boolean found = false;
            for (int num : a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            // If a number is not found in the array, it is the missing number
            if (!found) {
                System.out.println("Missing number: " + i);
                return;
            }
        }
    }
    public static int missingNumber(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        return sum - s2;
    }


    public static void main(String[] args) {
        int[]  arr={1,2};
        getMissingNumberInArray(arr);
        System.out.println(missingNumber(arr,3));
    }
}
