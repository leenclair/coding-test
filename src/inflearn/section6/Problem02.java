package inflearn.section6;

import java.util.Scanner;
import java.util.Stack;

public class Problem02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }

    static String solution(String str) {
        char[] array = str.toCharArray();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if(c == '(') cnt++;
            else if(c == ')') cnt--;
            else {
                if (cnt == 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    static String solutionStack(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
