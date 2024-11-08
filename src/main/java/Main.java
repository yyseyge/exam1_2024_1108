import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        System.out.println("==프로그램 시작==");

        Scanner sc = new Scanner(System.in);
        System.out.println("명령어) ");
        String command = sc.nextLine();
        System.out.println(command);
        System.out.printf("입력된 명령어 : %s\n", command);
        sc.close();
        System.out.println("==프로그램 끝==");
    }
}

