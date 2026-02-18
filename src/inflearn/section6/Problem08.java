package inflearn.section6;

import java.util.*;

public class Problem08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int priority = sc.nextInt();
            q.offer(new int[]{i, priority});
        }

        //
        int count = 0;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            boolean hasHigher = false;

            for (int[] other : q) {
                if(other[1] > cur[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if(hasHigher) {
                q.offer(cur);
            } else {
                count++;
                if(cur[0] == m) {
                    System.out.println(count);
                    return;
                }
            }
        }

    }

}
