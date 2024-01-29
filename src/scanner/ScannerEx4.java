package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단:");

        for (int i = n; i <= n; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
