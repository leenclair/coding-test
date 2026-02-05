package inflearn.section6;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }

    static String solution(String str) {
        char[] array = str.toCharArray();
        if(array[0] == ')') return "NO";

        Stack<Character> stack = new Stack<>();
        for (char c : array) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
