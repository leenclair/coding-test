package dongbin.chapter3;

import java.util.*;

public class Problem02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(m, k, arr));
    }

    static int solution(int m, int k, Integer[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            } else if(n > second){
                second = n;
            }
        }

        int block = k + 1;
        int maxCount = (m / block) * k + (m % block);

        return maxCount * first + (m - maxCount) * second;
    }
}
