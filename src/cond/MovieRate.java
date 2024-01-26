package cond;

public class MovieRate {
    public static void main(String[] args) {
        double rating = 8.5;
        
        if (rating <= 9) { // 눈이 높으면 어바웃타임만 추천해줄게~
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }

        if (rating <= 7) { // 눈이 낮으면 고질라까지 추천해줄게 ^^;;
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
