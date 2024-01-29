package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: "); // 10\n을 입력함
            int age = scanner.nextInt(); // nextInt는 10만 가져감
            scanner.nextLine(); // 이걸로 남은 \n을 읽고 버림 (넘어가서 name에 \n이 입력되지 않도록)

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
