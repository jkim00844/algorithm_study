package input_output;

import java.io.IOException;
import java.util.Scanner;

public class P2440 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.close();

        for(int i=cnt; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
