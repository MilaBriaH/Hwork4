package Hwork3;
/* Функции и процедуры
        Реализовать процедуру, которая переместит все значимые элементы влево, заполнив нулевые, например:
        Было:
        34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20
        Стало после применения процедуры:
        34, 14, 15, 18, 1, 20, 0, 0, 0, 0, 0
*/

public class Hometask3_2 {
    public static void main(String[] args) {
        int[] arrayOne = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        System.out.println("Original array is: ");
        for (int i = 0; i < arrayOne.length - 1; i++) {
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println(arrayOne[arrayOne.length - 1]);

        arrayTwo(arrayOne); // for markings


    }

    public static void arrayTwo(int[] arrayOne) {
        for (int a = arrayOne.length-1; a >=0; a --) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != 0 && i > 0 && arrayOne[i - 1] == 0) {
                    arrayOne[i - 1] = arrayOne[i];
                    arrayOne[i] = 0;
                    continue;
                }
            }
        }
        System.out.print(arrayOne[0]);
        for (int i = 1; i < arrayOne.length; i++) {
            System.out.print(", " + arrayOne[i]);
        }
    }
}









