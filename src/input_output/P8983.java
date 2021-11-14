package input_output;

import java.io.IOException;
import java.util.Scanner;

public class P8983 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }

        int sum2 = num * (num+1) / 2;
        System.out.println(sum);
        System.out.println(sum2);

    }
}
