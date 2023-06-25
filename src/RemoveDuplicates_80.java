/*
*
* Input: nums =     [1,1,1,2,2,3]
* Output: 5, nums = [1,1,2,2,3,_]
* Time = oN
* space = o1
*
* */

import java.util.Arrays;

public class RemoveDuplicates_80 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;

        Arrays.stream(nums).forEach(System.out::println);
        return i;
    }
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,1,2,2,3});
    }
}
