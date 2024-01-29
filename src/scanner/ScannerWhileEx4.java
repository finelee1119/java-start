package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료"); // 숫자 + \n 입력
            int option = scanner.nextInt(); // 숫자만 챙겨감

            if (option == 1) {
                scanner.nextLine(); // \n 없애주기 : 이걸 써줘야 결론에 상품명이 잘 들어감

                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity; // 상품을 계속 추가할 수 있으니 누적되도록 해야 함
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + price*quantity);

            } else if (option == 2) {
                System.out.println("총 비용:" + totalCost);
                totalCost = 0; // 결제 후 총 비용 초기화
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
