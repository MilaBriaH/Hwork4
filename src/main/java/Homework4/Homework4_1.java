package Homework4;
/*
На вход подается последовательность чисел, стремящаяся к бесконечности (последовательность может быть и из 100 чисел, может и их 1000000 чисел быть), оканчивающаяся на -101.
Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.
Условия задачи:
Все числа в диапазоне от -100 до 100.
Числа встречаются не более 2 147 483 647-раз каждое.
Сложность алгоритма - O(n)
 */

import java.util.Random;

public class Homework4_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random = new Random();

        int randomNumber = random.nextInt(200) + 1;

        int [] array = new int[randomNumber];


        fullArray(array);
        System.out.println();
    }

    public static void fullArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random randomTwo = new Random();
            array[i] = randomTwo.nextInt(201) - 100;
            array[array.length-1] = -101;
            System.out.print(array[i] + ", ");
            }
        }


    }

