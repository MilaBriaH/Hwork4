package Hwork3;
/* Функции и процедуры
        Реализовать функцию, принимающую на вход массив и целое число. Данная функция должна вернуть индекс этого числа в массиве.
        Если число в массиве отсутствует - вернуть -1.
        Реализовать процедуру, которая переместит все значимые элементы влево, заполнив нулевые, например:
        Было:
        34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20
        Стало после применения процедуры:
        34, 14, 15, 18, 1, 20, 0, 0, 0, 0, 0
*/
import java.util.Scanner;

public class Hometask3 {
    public static void main(String[] args) {
        System.out.println("Enter a number from array");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arrayOne = {12, 23, 45, 75, 64, 21, 8, 6, 0, -9};
        System.out.println(indexAr(arrayOne,number));

    }
    public static int indexAr (int[] arrayOne, int number) {
        int a = -1;
        for (int i=0; i < arrayOne.length; i++) {
            if (arrayOne[i] == number)
                a = i;
            }
           return a;

        }


    }

