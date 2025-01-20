import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int random = new Random().nextInt(10);
        int tryCount = 3;
        int status = 1;

        while (status == 1) {
            status = game(tryCount, random);
        }
    }

    public static int game(int tryCount, int random) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= tryCount; i++) {
            System.out.println("Введите загаданное число");
            String name = scanner.next();

            try {
                int number = Integer.parseInt(name);

                if (number > random) {
                    System.out.println("Меньше");
                } else if (number < random) {
                    System.out.println("Больше");
                } else {
                    System.out.println("Верно");
                    break;
                }
            } catch (NumberFormatException ignore) {
            }
        }
        System.out.println("Повторить игру еще раз?");
        String name = scanner.next();
        try {
            return Integer.parseInt(name);
        } catch (NumberFormatException ignore) {
        }
        return 0;
    }
}