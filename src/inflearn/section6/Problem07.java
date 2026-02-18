package inflearn.section6;

import java.util.*;

public class Problem07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        String design = sc.next();

        Queue<Character> queue = new ArrayDeque<>();
        Set<Character> required = new HashSet<>();

        // 필수과목 저장
        for (char c : order.toCharArray()) {
            queue.offer(c);
            required.add(c);
        }

        for (char c : design.toCharArray()) {

            if (required.contains(c)) {

                // 필수 과목인데 queue가 이미 비어있거나, 현재 바라보고 있는게 다른 경우
                if (queue.isEmpty() || queue.peek() != c) {
                    System.out.println("NO");
                    return;
                }

                queue.poll();
            }
        }

        // 필수과목을 다 이수했는지 확인
        if (queue.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }

}
