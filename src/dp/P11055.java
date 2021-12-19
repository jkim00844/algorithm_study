package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < N; i++) {
            dp[i] = 1;

            // 0 ~ i 이전 원소들 탐색
            for(int j = 0; j < i; j++) {
                // 기준값보다 작은 값이 존재하며, 현재 저장된 수열의 길이가 작은 값의 수열 길이+1 보다 작으면,
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;

                }
            }
        }

        int max = -1;
        for(int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);

    }
}
