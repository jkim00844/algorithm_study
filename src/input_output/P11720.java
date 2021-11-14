package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int num = 0;
        for(int i = 0; i<cnt; i++){
            num += str.charAt(i)-48;
        }

        System.out.println(num);
    }
}
