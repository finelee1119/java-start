package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        while (true) {
            number = input.nextInt();

            if (number == -1) {
                break;
            }

            sum += number;
            count++;
        }

        double avg = (double) sum / count;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}