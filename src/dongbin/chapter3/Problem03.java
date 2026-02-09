package dongbin.chapter3;

import java.util.*;

public class Problem03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int answer = solution(matrix);
        System.out.println(answer);
    }

    static int solution(int[][] matrix) {
        int answer = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int rowMin = Integer.MAX_VALUE;
            for (int v : row) rowMin = Math.min(rowMin, v);
            answer = Math.max(answer, rowMin);
        }
        return answer;
    }
}
