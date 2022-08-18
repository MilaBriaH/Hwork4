package Rush_;

import java.util.Scanner;

public class Task_rush_seven {
    public static void main(String[] args) {
        int number;
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Input a number: ");
        number = scanNum.nextInt();
        for (int i=1; i <=10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }

    }
}
