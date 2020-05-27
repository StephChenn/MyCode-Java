package array;

/**
 * description:加一
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/13 10:59
 */
public class P68 {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits =new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
