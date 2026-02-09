package dongbin.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example01 {
    private static final char[] DIR = {'L','R','U','D'};
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 제거

        String[] cmds = sc.nextLine().split(" ");

        int x = 1, y = 1;

        for (String s : cmds) {
            char c = s.charAt(0);

            int nx = x, ny = y;
            for (int i = 0; i < 4; i++) {
                if (c == DIR[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                    break;
                }
            }

            // 경계 밖이면 무시
            if (nx < 1 || nx > n || ny < 1 || ny > n) continue;

            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }

    static String solution(int n, String[] cmds) {
        Map<Character, int[]> move = new HashMap<>();
        move.put('L', new int[]{0, -1});
        move.put('R', new int[]{0,  1});
        move.put('U', new int[]{-1, 0});
        move.put('D', new int[]{1,  0});

        int x = 1, y = 1;

        for (String s : cmds) {
            int[] d = move.get(s.charAt(0));
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 1 || nx > n || ny < 1 || ny > n) continue;

            x = nx;
            y = ny;
        }

        return x + " " + y;
    }
}
