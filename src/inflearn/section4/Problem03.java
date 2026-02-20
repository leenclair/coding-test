package inflearn.section4;

import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println(solution(n, k, arr));
    }

    static int solution(int n, int k, int[] arr) {
        int sum = 0;

        // 윈도우 창 열고
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int answer = sum;

        // 윈도우 한 칸씩 이동
        for(int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

}
