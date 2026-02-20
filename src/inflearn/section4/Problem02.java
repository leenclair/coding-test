package inflearn.section4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        solution(arr1, arr2);

    }

    static void solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        StringBuilder sb = new StringBuilder();

        while(p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] == arr2[p2]) {
                sb.append(arr1[p1]).append(" ");
                p1++;
                p2++;
            } else if(arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        System.out.println(sb);
    }

}
