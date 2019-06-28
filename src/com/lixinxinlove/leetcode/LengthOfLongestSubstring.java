package com.lixinxinlove.leetcode;


/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }

        int maxTemp = 1;
        int maxLength = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            String sub;
            maxTemp = 1;
            for (int j = i + 1; j < s.length(); j++) {
                sub = s.substring(i, j);
                if (sub.contains(s.charAt(j) + "")) {
                    break;
                } else {
                    maxTemp++;
                }
            }
            maxLength = Math.max(maxLength, maxTemp);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        LengthOfLongestSubstring los = new LengthOfLongestSubstring();
        int l = los.lengthOfLongestSubstring("bbbbb");
        System.out.println("---------------------------");
        System.out.println(l);
        System.out.println("---------------------------");
    }
}
