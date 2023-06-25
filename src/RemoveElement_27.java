import java.util.Arrays;
/*
*
* Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
*
* Time: o(n)
* Space: o(1)
*
*
*
* */
public class RemoveElement_27 {

    public static int removeElement(int[] a, int val){
        int j = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != val){
                a[j++] = a[i];
            }
        }

        Arrays.stream(a).forEach(System.out::println);
        return j;
    }

    public static void main(String[] args){
        removeElement(new int[] {3,2,2,3}, 3);
    }
}
