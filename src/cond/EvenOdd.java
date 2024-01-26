package cond;

public class EvenOdd {
    public static void main(String[] args) {
        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
