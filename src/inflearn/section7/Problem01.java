package inflearn.section7;

import java.util.*;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]) minIdx = j;
            }

            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
