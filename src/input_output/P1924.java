package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1924 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        // 1월 1일이 월요일이므로 전체 일수를 7로 나눈 나머지가 요일
        int[] last_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"SUN", "MON", "THU", "WED", "THU", "FRI", "SAT"};

        for (int i=0; i<month-1; i++){
            day += last_days[i];
        }
        System.out.println(weeks[day%7]);

    }
}
