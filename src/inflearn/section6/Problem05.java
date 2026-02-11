package inflearn.section6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    static int solution(String str) {
        char[] array = str.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if(c == '(') stack.push(c);
            else {
                stack.pop();
                if(array[i-1] == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }
}
