package loop;

public class WhileEx3 {
    public static void main(String[] args) {
        // 1부터 max까지의 합
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
