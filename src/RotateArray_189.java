import java.util.Arrays;

public class RotateArray_189 {
    /*
    * Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    *
    * */

    public static void rotateArray(int[] a, int k){
        int n = a.length;
        k = k%n;
        reverse(a, 0, n-1);
        reverse(a, 0, k-1);
        reverse(a, k, n-1);

        Arrays.stream(a).forEach(System.out::println);
    }
    public static void reverse(int[] a, int i, int j){
        while (i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
