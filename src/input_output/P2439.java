package input_output;

import java.io.IOException;
import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.close();

        for(int i=1; i<=cnt; i++){
            for(int j=cnt; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
