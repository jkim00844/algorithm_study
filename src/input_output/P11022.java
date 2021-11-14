package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i<cnt; i++){
            str = br.readLine();

            int num1 = str.charAt(0) - 48;
            int num2 = str.charAt(2) - 48;

            System.out.println(String.format("Case #%d: %d + %d = %d", (i+1), num1, num2, (num1+num2)));
        }
    }
}
