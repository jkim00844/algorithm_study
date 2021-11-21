package dp;

import java.util.Scanner;

public class P9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i =0; i<=T; i++){
            int N = sc.nextInt();
            System.out.println(recur(N));
        }

    }

    private static int recur(int N) {
        if(N==1) return  1;
        if(N==2) return  2;
        if(N==3) return  4;
        else return recur(N-3) + recur(N-2) + recur(N-1);

    }
}
