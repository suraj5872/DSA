import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUnion {
    static int[] unionArray(int[]a,int[]b){
        int m= a.length;
        int n=b.length;
        int k=0;
        int[] tempResult =new int[m+n];
        for (int i = 0; i < m; i++) {
            tempResult[k++]=a[i];
        }
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j=0;j<k;j++){
                if (b[i]==tempResult[j]){
                    found=true;
                    break;
                }
            }
            if (!found){
                tempResult[k++] =b[i];
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = tempResult[i];
        }

        return result;
    }
    static List<Integer> unionArrayUsing2PointerAlgo(int[]a,int[]b){
        int m =a.length;
        int n= b.length;
        int i = 0, j = 0;
        List<Integer> unionList = new ArrayList<>();
        while (i<m && j<n){
            if (a[i]<=b[j]){
                if (unionList.isEmpty() ||unionList.get(unionList.size()-1) != a[i] ){
                    unionList.add(a[i]);
                }
                i++;
            }
            else {
                if (unionList.isEmpty() ||unionList.get(unionList.size()-1) != b[j] ){
                    unionList.add(b[j]);
                }
                j++;
            }
        }
        while (i<n){
            if (unionList.isEmpty()|| unionList.get(unionList.size()-1)!=a[i]){
                unionList.add(a[i]);
            }
            i++;
        }

        while (j<m){
            if (unionList.isEmpty()|| unionList.get(unionList.size()-1)!=b[j]){
                unionList.add(b[j]);
            }
            j++;
        }
        return unionList;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={2,3,4,4,5};
        int[] resultedArray = unionArray(a,b);
        for (int j : resultedArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        List<Integer> resultedArray1 = unionArrayUsing2PointerAlgo(a,b);
        for (int k:resultedArray1){
            System.out.print(k+" ");
        }

    }
}
