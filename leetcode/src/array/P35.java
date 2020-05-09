package array;

/**
 * description:搜索插入位置
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/9 13:44
 */
public class P35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length==0||nums==null){
            return 0;
        }
        int i = 0;
        while (i<nums.length){
            if(target<=nums[i]){
                return i;
            }
            i++;

        }
        return i;
    }
}
