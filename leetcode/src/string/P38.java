package string;

/**
 * description:外观数列
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/9 17:10
 */
public class P38 {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        int p1=0;
        int cur=1;
        String str =countAndSay(n-1);
        for (;cur<str.length();cur++){
            if (str.charAt(p1) != str.charAt(cur)) {
                sb.append(cur-p1).append(str.charAt(p1));
                p1=cur;
            }
        }
        sb.append(cur-p1-1).append(str.charAt(p1));

        return sb.toString();
    }
}
