public class LinearSearch {
    static int linearSearch(int[] a,int target){
        for (int i = 0; i <a.length ; i++) {
            if (a[i] ==target){
                System.out.println(+a[i]+" is present at "+i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,4,5,9,7,12,16};
        System.out.println(" ");
        System.out.println(linearSearch(a,7));
    }
}
