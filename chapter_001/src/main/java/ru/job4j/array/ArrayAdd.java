package ru.job4j.array;

/**
 * Класс склеивает два массива в один и сортирует по возрастанию
 * @author Alesksand Launbraun
 * @since 10.04.2018
 * @version 1.0
 */
public class ArrayAdd {

    /**
     * Метод склеивает два массива в один и сортирует по возрастанию
     * @param arrayA первый массив
     * @param arrayB второй массив
     * @return объединенный отсортированный массив
     */
    public int[] gluing(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        for (int j = arrayA.length; j < arrayA.length + arrayB.length; j++) {
            arrayC[j] = arrayB[j - arrayA.length];
        }
        BubbleSort ranking = new BubbleSort();
        arrayC = ranking.sort(arrayC);
        return arrayC;
    }
}
