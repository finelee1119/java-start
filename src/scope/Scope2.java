package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("if m = " + m);
            System.out.println("if x = " + i);
        } // i 생존 종료

        // System.out.println("main i = " + i); // 오류. 변수 i에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료
}
