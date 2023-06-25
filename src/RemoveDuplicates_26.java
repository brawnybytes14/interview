import java.util.Arrays;

/*
* Input: nums = [1,1,2]
*
Output: 2, nums = [1,2,_]
*
*
* */
public class RemoveDuplicates_26 {
    public static int removeDuplicates(int[] a){
        int n = a.length;
        if(n == 1){
            return 1;
        }

        int j = 1;
        for (int i = 1; i < n; i++){
            if(a[i-1] != a[i]){
                a[j++] = a[i];
            }
        }
        Arrays.stream(a).forEach(System.out::println);
        return j;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] { 0,0,1,1,1,2,2,3,3,4});
    }
}
