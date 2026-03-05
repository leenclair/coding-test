package inflearn.section5;

import java.util.*;

public class Problem05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        // 3장 뽑는 모든 조합
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    set.add(sum);   // 중복 자동 제거
                }
            }
        }

        // List로 변환 후 정렬
        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        if (list.size() < k) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}
