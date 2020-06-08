package dynamicprogramming;

/**
 * description:打家劫舍
 *
 * @author jiajin.chen
 * @date 2020/6/8 9:12
 */
public class P198 {
    public int rob(int[] nums) {
        //动态规划方程：dp[n]=Max(dp[n-1],dp[n-2]+nums[n])
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
