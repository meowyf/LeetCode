package com.meow.leetcode;

/**
 * leetCode 485 题 （数组）
 * 给定一个二进制数组， 计算其中最大连续 1 的个数。
 * 示例：
 *
 * 输入：[1,1,0,1,1,1]
 * 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 *
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/18 12:45:13
 */
public class LeetCode0485 {

    public static void main(String[] args) {
        System.out.println(LeetCode0485.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    /**
     * 一次遍历
     *  
     * @param nums
     * @return int 
     * @author meowyf
     * @date 2021/2/18 12:50:38
     * @version 1.0
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
    
    /**
     * 描述
     *  
     * @param nums 
     * @return int 
     * @author meowyf
     * @date 2021/2/18 12:56:45
     * @version 1.0
     */
    public static  int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0, res = 0;
        for(int e : nums){
            max = e > 0 ? ++max : 0;
            if(max > res) res = max;
        }
        return res;
    }
}
