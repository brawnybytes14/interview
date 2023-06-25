import java.util.Arrays;
/*
 * Time Taken:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 *                      i      k                     j
 * Output: [1,2,2,3,5,6]
 *
 * Time: O(n)
 * Space: O(1)
 *
 * */
public class MergeSortedArray {
    public static void merge(int[] a, int m, int[] b, int n) {
        int i = m-1, k = m+n-1, j = n-1;
        while (k >= 0 && j >= 0 && i >=0){
            if (a[i] >= b[j]){
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
            k--;
        }

        if(i != -1){
            while (i >= 0){
                a[k] = a[i];
                k--;
                i--;
            }
        } else if (j != -1) {
            while (j >= 0){
                a[k] = b[j];
                k--;
                j--;
            }
        }
        print(a);
    }

    public static void print(int[] a){
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,0,0,0};
        int[] b = new int[]{2,5,6};

        merge(a, 3, b, 3);
    }
}