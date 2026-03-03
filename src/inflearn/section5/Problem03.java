package inflearn.section5;

import java.util.*;

public class Problem03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(map.size()).append(' ');

        for (int rt = k; rt < n; rt++) {
            int ltVal = arr[rt - k];
            int newCount = map.get(ltVal) - 1;
            if (newCount == 0) map.remove(ltVal);
            else map.put(ltVal, newCount);

            int rtVal = arr[rt];
            map.put(rtVal, map.getOrDefault(rtVal, 0) + 1);

            sb.append(map.size()).append(' ');
        }

        System.out.print(sb);

    }

}
