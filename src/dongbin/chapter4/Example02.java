package dongbin.chapter4;

import java.util.Scanner;

public class Example02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int h = 0; h <= n; h++) {
            for(int m = 0; m < 60; m++) {
                for(int s = 0; s < 60; s++){
                    String t = String.format("%02d%02d%02d", h, m, s);
                    if (t.contains("3")) count++;
                }
            }
        }

        System.out.println(count);
    }

    static boolean solution(int h, int m, int s) {
        return (h % 10 == 3 || h / 10 == 3 ||
                m % 10 == 3 || m / 10 == 3 ||
                s % 10 == 3 || s / 10 == 3);
    }
}
