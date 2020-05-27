package array;

import java.util.HashMap;

/**
 * description:和为K的子数组
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/15 10:35
 */
public class P560 {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int pre =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            if(map.containsKey(pre)){
                map.put(pre,map.get(pre)+1);
            }else{
                map.put(pre,1);
            }
        }
        return count;
    }
}
