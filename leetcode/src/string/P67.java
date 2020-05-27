package string;

/**
 * description:二进制求和
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/14 10:27
 */
public class P67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;//进位
        for (int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int sum = carry;
            sum+=(i>=0?a.charAt(i)-'0':0);
            sum+=(j>=0?b.charAt(j)-'0':0);
            sb.append(sum%2);
            carry=sum/2;
        }
        sb.append(carry==0?"":1);
        return sb.reverse().toString();
    }
}
