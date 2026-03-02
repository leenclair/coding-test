package inflearn.section4;

import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int lt = 1;
        int sum = 0;

        for (int rt = 1; rt < n; rt++) {
            sum += rt;

            while (sum >= n) {
                if (sum == n) count++;
                sum -= lt++;
            }
        }

        System.out.println(count);
    }

}
