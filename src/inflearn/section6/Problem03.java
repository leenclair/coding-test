package inflearn.section6;

import java.util.*;

public class Problem03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i<m; i++) {
            moves[i] = sc.nextInt();
        }

        int result = solution(board, moves);
        System.out.println(result);
    }

    static int solution(int[][] board, int[] moves) {
        int n = board.length;

        // 각 열을 Deque로 변환
        List<Deque<Integer>> cols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cols.add(new ArrayDeque<>());
        }

        // 위 → 아래로 읽으면서
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] != 0) {
                    cols.get(c).addLast(board[r][c]);
                }
            }
        }

        Deque<Integer> basket = new ArrayDeque<>();
        int removed = 0;

        for (int move : moves) {
            int c = move - 1;
            if (c < 0 || c >= n) continue;

            if (cols.get(c).isEmpty()) continue;

            int doll = cols.get(c).removeFirst();  // 맨 위(첫번째) 제거

            if (!basket.isEmpty() && basket.peekLast() == doll) {
                basket.removeLast();
                removed += 2;
            } else {
                basket.addLast(doll);
            }
        }

        return removed;
    }
}
