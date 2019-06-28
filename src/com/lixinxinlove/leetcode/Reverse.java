package com.lixinxinlove.leetcode;

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Reverse {
    public int reverse(int x) {
        boolean f;
        if (x > 0) {
            f = true;
        } else {
            f = false;
        }

        x = Math.abs(x);

        int r = 0;
        int[] arr = new int[10];
        int i = 0;

        while (true) {
            int a = x % 10;
            x /= 10;
            arr[i] = a;
            i++;
            if (i > 32) {
                return 0;
            }
            if (x == 0) {
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            r += arr[j] * Math.pow(10, i - j - 1);
        }

        if (r >=(int) Math.pow(2, 31) - 1 && f) {
            return 0;
        }

        if (-r <= ((int) Math.pow(-2, 31)) + 1 && !f) {
            return 0;
        }

        if (f) {
            return r;
        } else {
            return -r;
        }
    }
}
