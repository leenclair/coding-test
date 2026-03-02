package inflearn.section4;

import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int lt = 0;
        int zeroCount = 0;
        int answer = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) zeroCount++;

            while (zeroCount > k) {
                if (arr[lt] == 0) zeroCount--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.println(answer);

    }

}
