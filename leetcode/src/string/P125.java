package string;

/**
 * description:验证回文串
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/6/1 9:18
 */
public class P125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (!isChar(chars[i])) {
                i++;
                continue;
            }
            if (!isChar(chars[j])){
                j--;
                continue;
            }
            if (chars[i]==chars[j]){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;

    }
    public static  boolean isChar(char c){
        if ('a'<=c&&c<='z'||'A'<=c&&c<='Z'||'0'<=c&&c<='9'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(";0P");
    }
}
