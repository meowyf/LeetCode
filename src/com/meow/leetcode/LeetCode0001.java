package com.meow.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 力扣 第1题
 *
 * 两数之和题解
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 *         输入：nums = [2,7,11,15], target = 9
 *         输出：[0,1]
 *         解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *         示例 2：
 *
 *         输入：nums = [3,2,4], target = 6
 *         输出：[1,2]
 *
 * @author meowyf
 * @date 2021/2/18 09:44:01
 * @version 1.0
 */
public class LeetCode0001 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(Solution02.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    /**
     * 使用map解题法 时间复杂度低
     *
     * @author meowyf
     * @date 2021/2/18 09:43:14
     * @version 1.0
     */
    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("meow");
        }
    }

    /**
     * 暴力解法
     *
     * @author meowyf
     * @date 2021/2/18 09:43:40
     * @version 1.0
     */
    public static class Solution02 {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < (nums.length - 1); j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            throw new IllegalArgumentException("meow");
        }
    }
}
