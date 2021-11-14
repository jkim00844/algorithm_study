package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i<cnt; i++){
            str = br.readLine();

            int num1 = str.charAt(0) - 48;
            int num2 = str.charAt(2) - 48;
            sb.append("Case #"+(i+1)+": ").append((num1+num2)).append('\n');
        }
        System.out.println(sb);
    }
}
