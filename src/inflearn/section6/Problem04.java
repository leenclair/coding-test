package inflearn.section6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = solution(str);
        System.out.println(answer);
    }

    static int solution(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) stack.push(c - '0');
            else {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                if (c == '+') result = a + b;
                else if (c == '-') result = a - b;
                else if (c == '*') result = a * b;
                else if (c == '/') result = a / b;

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
