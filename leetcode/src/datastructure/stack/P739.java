package datastructure.stack;

import java.util.Stack;

/**
 * description:每日温度
 *根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。
 * 如果之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 * 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]
 *
 * @author jiajin.chen
 * @date 2020/6/11 14:13
 */
public class P739 {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<T.length;i++){
            while (!stack.isEmpty() && T[stack.peek()] < T[i]){
                int temp = stack.pop();
                res[temp]=i-temp;
            }
            stack.push(i);
        }
        return res;
    }
}
