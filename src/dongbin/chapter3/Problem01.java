package dongbin.chapter3;

import java.util.*;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = {100, 500, 50, 10};
        int answer = solution(n, nArr);
        System.out.println(answer);
    }

    static int solution(int n, int[] nArr) {
        int count = 0;
        sortDesc(nArr);

        for (int coin : nArr) {
            count += n / coin;
            n %= coin;
            if (n == 0) break;
        }

        return count;
    }

    static void sortDesc(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int maxIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[maxIdx]) maxIdx = j;
            }

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }
}
