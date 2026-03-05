package inflearn.section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() < t.length()) {
            System.out.println(0);
            return;
        }

        int n = s.length();
        int m = t.length();

        // equals 판단할 tMap 생성
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        // sMap에 m-2까지의 문자 넣기
        for (int i = 0; i < m - 1; i++) sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);

        int lt = 0, answer = 0;
        for (int i = m - 1; i < n; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            if(sMap.equals(tMap)) answer++;

            // s의 lt 위치 문자를 가져와서 sMap에서 있다면 -1, 없다면 제거
            char left = s.charAt(lt);
            if(sMap.get(left) == 1) sMap.remove(left);
            else sMap.put(left, sMap.get(left) - 1);
            lt++;
        }

        System.out.println(answer);
    }

}
