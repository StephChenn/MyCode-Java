package dynamicprogramming;

/**
 * description:判断子序列
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/6/4 9:07
 */
public class P392 {
    public boolean isSubsequence(String s, String t) {
        //s = "abc", t = "ahbgdc"
        //返回 true
        int i = 0;
        for (char c:s.toCharArray()){
            while (i<t.length()&&c!=t.charAt(i)){
                i++;//不相等，下标+1
            }
            i++;
            if(i>t.length()){
                return false;
            }
        }
        return true;

    }
    public boolean isSubsequence1(String s, String t) {
        // 预处理
        t = " " + t; // 开头加一个空字符作为匹配入口
        int n = t.length();
        int[][] dp = new int[n][26]; // 记录每个位置的下一个ch的位置
        for (char ch = 0; ch < 26; ch++) {
            int p = -1;
            for (int i = n - 1; i >= 0; i--) { // 从后往前记录dp
                dp[i][ch] = p;
                if (t.charAt(i) == ch + 'a') {
                    p = i;
                }
            }
        }
        // 匹配
        int i = 0;
        for (char ch : s.toCharArray()) { // 跳跃遍历
            i = dp[i][ch - 'a'];
            if (i == -1) {
                return false;
            }
        }
        return true;
    }

}
