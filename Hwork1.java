import java.util.Scanner;

class Hwork1 {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int min = number;
        while (number != -1) {
            if (number < min) {
                min = number;
                }
            number = scanner.nextInt();
            }
        System.out.println(min);
        }
    }