import java.util.Scanner;

public class Hometask2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sumEven=0;
        int sumUnEven=0;
        while (a != -1) {
            if (a % 2 == 0) {
                sumEven= sumEven + 1;
            }
            if (a % 2 == 1 || a % 2 == -1) {
                sumUnEven= sumUnEven + 1;
            }
            a = scanner.nextInt();
        }
        System.out.println("Amount of even numbers " + sumEven);
        System.out.println("Amount of uneven numbers " + sumUnEven);
    }

}
