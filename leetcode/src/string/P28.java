package string;

/**
 * description:实现 strStr()
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/9 9:56
 */
public class P28 {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return 0;
        }
        if (haystack.length()<needle.length()){
            return -1;
        }
        int i=0;
        int len=needle.length();
        char c =needle.charAt(0);
        while (i+len<=haystack.length()){
            if (haystack.charAt(i)==c){
                if(haystack.substring(i,i+len).equals(needle)){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}

