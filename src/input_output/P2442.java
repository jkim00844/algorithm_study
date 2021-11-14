package input_output;

import java.io.IOException;
import java.util.Scanner;

public class P2442 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.close();

        // cnt - i번째 줄에서 시작
        // 2*i-1 개씩
        for(int i=1; i<=cnt; i++){
            for(int j=1; j<cnt-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
