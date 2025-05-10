import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        if (age < 10) {
            System.out.println("안녕 꼬마야!");
        } else if (age < 20) {
            System.out.println("청소년이구나.");
        } else if (age < 40) {
            System.out.println("멋진 어른이네요!");
        } else {
            System.out.println("인생의 깊이를 아는 시기군요");
        }
        scanner.close();
    }
}