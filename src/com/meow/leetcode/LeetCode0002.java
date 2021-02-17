package com.meow.leetcode;
/*
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
        请你将两个数相加，并以相同形式返回一个表示和的链表。
        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
*/
/*
输入：l1 = [2,4,3], l2 = [5,6,4]
        输出：[7,0,8]
        解释：342 + 465 = 807.
        示例 2：

        输入：l1 = [0], l2 = [0]
        输出：[0]
        示例 3：

        输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        输出：[8,9,9,9,0,0,0,1]*/


import java.util.Arrays;

public class LeetCode0002 {

    public static void main(String[] args) {
        Solution.addTwoNumbers(new int[]{2, 4, 3}, new int[]{5, 6, 4});
    }


    static class Solution {
        /**
         * 输入：l1 = [2,4,3], l2 = [5,6,4 ]
         * 输出：[7,0,8]
         * 解释：342 + 465 = 807.
         * 示例 2：
         */
        public static int[] addTwoNumbers(int[] l1, int[] l2) {
            StringBuffer stringBuffer1 = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            int[] l3 = new int[3];
            int[] reserve = reserve(l1);
            int[] reserve1 = reserve(l2);
            for (int i = 0; i < reserve.length; i++) {
                stringBuffer1.append(reserve[i]);
            }
            for (int i = 0; i < reserve1.length; i++) {
                stringBuffer2.append(reserve1[i]);
            }
            Integer i = Integer.parseInt(stringBuffer1.toString()) + Integer.parseInt(stringBuffer2.toString());
            String s = String.valueOf(i);
            for (int i1 = 0; i1 < s.length(); i1++) {
                System.out.println(Integer.parseInt(Arrays.asList(s).get(i1)));
            }
            return reserve(l3);
        }

        public static int[] reserve(int[] arr) {
            int[] arr1 = new int[arr.length];
            for (int x = 0; x < arr.length; x++) {
                arr1[x] = arr[arr.length - x - 1];
            }
            return arr1;
        }
    }

}
