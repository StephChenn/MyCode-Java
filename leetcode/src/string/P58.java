package string;

import java.util.Stack;

/**
 * description:最后一个单词的长度
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/11 15:39
 */
public class P58 {
    public static int lengthOfLastWord(String s) {
        int end = s.length()-1;
        while (end>=0 && s.charAt(end)==' '){
            end--;
        }
        if(end<0){
            return 0;
        }
        int start = end;
        while (start>=0 && s.charAt(start)!=' '){
            start--;
        }
        return end-start;
    }
}
