package array;

import java.util.HashMap;
import java.util.Map;


/**
 * description:两数之和 II - 输入有序数组
 *
 * @author jiajin.chen
 * @date 2020/6/5 14:52
 */
public class P167 {
    public int[] twoSum(int[] numbers, int target) {
        //双指针
        int[] res =new int[2];
        int i=0;
        int j=numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]<target){
                i++;
                continue;
            }
            if (numbers[i]+numbers[j]==target){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
            if (numbers[i]+numbers[j]>target){
                j--;
                continue;
            }
        }
        return  res;
    }
}
