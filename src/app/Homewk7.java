package app;

import java.util.Random;

public class Homewk7 {

    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Елементи масиву: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sumNegative = 0;
        for (int num : array) {
            if (num < 0) {
                sumNegative += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegative);

        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        int minValue = array[0];
        int maxValue = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + minValue + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxValue + " (з індексом " + maxIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
        } else {
            int sumAfterNegative = 0;
            int countAfterNegative = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }

            if (countAfterNegative > 0) {
                double average = (double) sumAfterNegative / countAfterNegative;
                System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
            } else {
                System.out.println("Немає чисел після першого від'ємного.");
            }
        }
    }
}



