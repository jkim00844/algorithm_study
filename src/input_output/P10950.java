package input_output;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int arr[] = new int[cnt];

        for(int i = 0; i<cnt; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            arr[i] = num1+num2;
        }

        for(int i = 0; i<cnt; i++){
            System.out.println(arr[i]);
        }
    }
}
