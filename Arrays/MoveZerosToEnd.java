public class MoveZerosToEnd {

    public static int[] moveZeros(int n, int []a){
        int j=0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0){
                int temp = a[i];
                a[i] =a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }
}


