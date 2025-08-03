package Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Two Sum
 *
 * Description:
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers
 * such that they add up to `target`.
 *
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 *
 * You can return the answer in any order.
 *
 * Method Signature:
 * public int[] twoSum(int[] nums, int target)
 *
 * Constraints:
 * • 2 <= nums.length <= 10^4
 * • -10^9 <= nums[i] <= 10^9
 * • -10^9 <= target <= 10^9
 * • Exactly one solution exists.
 *
 * Example 1:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 *
 * Example 3:
 * Input: nums = [3, 3], target = 6
 * Output: [0, 1]
 */

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<= nums.length; i++)
        {
            if (map.containsKey(target-nums[i]))
            {
             return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,10,15};
        int[] twoSum = twoSum(arr, 17);
        Arrays.stream(twoSum).forEach(System.out::println);
    }
}
