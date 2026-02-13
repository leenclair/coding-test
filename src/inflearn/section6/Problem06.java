package inflearn.section6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Problem06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) q.offer(i);

        while (q.size() > 1) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            q.poll();
        }

        System.out.println(q.poll());
    }

    static int josephus(int n, int k) {
        if (n == 1) return 1;

        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

}
