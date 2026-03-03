package inflearn.section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int max = 0;
        char answer = ' ';

        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }

}
