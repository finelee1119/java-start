import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int count = input.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        System.out.print("입력한 정수의 합계: " + sum);
        System.out.print("입력한 정수의 평균: " + average);

    }
}
