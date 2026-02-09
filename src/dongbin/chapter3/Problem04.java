package dongbin.chapter3;

import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = solution(n, m);
        System.out.println(answer);

    }

    static int solution(int n, int k){
        int count = 0;
        while(n > 1) {
            if (n % k == 0) n /= k;
            else n -= 1;
            count++;
        }
        return count;
    }

    static int solution2(int n, int k){
        int count = 0;
        while (true) {
            int target = (n / k) * k;
            count += (n - target);
            n = target;

            if (n < k) break; // 나누기 불가
            n /= k;
            count++;
        }

        // 남은 건 전부 1씩 빼기
        count += (n - 1);
        return count;
    }
}
