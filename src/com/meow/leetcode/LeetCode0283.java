package com.meow.leetcode;

/**
 * 力扣第 283 题 （数组）
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * @author meowyf
 * @version 1.0
 * @date 2021/02/18 12:28:37
 */
public class LeetCode0283 {

    public static void main(String[] args) {
        LeetCode0283.moveZeroes(new int[]{0,1,0,3,12});
    }

    /**
     * 描述
     *  
     * @param nums 
     * @return void 
     * @author meowyf
     * @date 2021/2/18 12:36:12
     * @version 1.0
     */
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        // 第一次遍历，j指针记录非0的个数
        // 非0的赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 第二次遍历把末尾的元素全部赋值为0
        // 注：非0元素统计完了，剩下的都是0了
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

}
