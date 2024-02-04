package cond.ex;

public class BigNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // (조건) ? 참일 때 : 거짓일 때

        int number = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + number + "입니다.");
    }
}
