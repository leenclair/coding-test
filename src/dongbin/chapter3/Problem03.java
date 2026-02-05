package dongbin.chapter3;

import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

    }

    static void solution(int n, int k) {
        int result = 0;

        while (true){
            int target = (n / k) * k; //25
            result += (n - target); // 0
            n = target; // 25

            if(n < k) break;
            result++;
            n /= k; // 5 = 25/5
        }

        result += (n - 1);

    }
}
