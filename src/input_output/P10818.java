package input_output;

import java.io.IOException;
import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int num = sc.nextInt();

        int min = num;
        int max = num;

        for(int i=0; i<cnt-1; i++){
            num = sc.nextInt();
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        sc.close();

        System.out.println(min);
        System.out.println(max);

    }
}
