package math;

/**
 * description: x 的平方根
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/18 10:05
 */
public class P69 {
    public int mySqrt(int x) {
        //二分查找法
        int l=0;
        int r=x;
        int ans=-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid<=x){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
