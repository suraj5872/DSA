public class ReverseArray {
    static void reverseArray(int[] arr){
        int start =0,end=arr.length-1;
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void printArray(int[] arr){

    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        reverseArray(a);
    }
}
