package inflearn.section4;

import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        solution(arr1, arr2);
    }

    static void solution(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            if(arr1[p1] <= arr2[p2]) {
                System.out.print(arr1[p1++] + " ");
            } else {
                System.out.print(arr2[p2++] + " ");
            }
        }

        while(p1 < n) {
            System.out.print(arr1[p1++] + " ");
        }

        while(p2 < m) {
            System.out.print(arr2[p2++] + " ");
        }
    }

    static void solutionDuplicate(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int p1 = 0, p2 = 0;
        Integer last = null; // 마지막 출력값 저장

        while(p1 < n && p2 < m) {
            int value;

            if(arr1[p1] <= arr2[p2]) {
                value = arr1[p1++];
            } else {
                value = arr2[p2++];
            }

            if(last == null || last != value) {
                System.out.print(value + " ");
                last = value;
            }
        }

        // 남은 값 처리
        while(p1 < n) {
            int value = arr1[p1++];
            if(last == null || last != value) {
                System.out.print(value + " ");
                last = value;
            }
        }

        while(p2 < m) {
            int value = arr2[p2++];
            if(last == null || last != value) {
                System.out.print(value + " ");
                last = value;
            }
        }
    }

}
