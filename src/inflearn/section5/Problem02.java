package inflearn.section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.length() != str2.length()) {
            System.out.println("NO");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()) {
            if(map.get(c) == null || map.get(c) == 0) {
                System.out.println("NO");
                return;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        System.out.println("YES");

    }

}
