public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("제" + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 단 간 줄바꿈
        }
    }
}