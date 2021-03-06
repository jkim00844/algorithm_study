package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11721 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i = 0; i<str.length(); i++){
            sb.append(str.charAt(i));

            if((i+1) % 10 == 0){
                sb.append("\n");
            }
        }

        System.out.println(sb);


    }
}
