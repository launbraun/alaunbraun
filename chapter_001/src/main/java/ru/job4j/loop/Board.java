package ru.job4j.loop;

/**
 * Класс суммирует четные числа
 *
 * @author Alesksand Launbraun
 * @since 11.03.2018
 * @version 1.0
 */
public class Board {

    /**
     * Вывод в консоль шахматной доски с заданными шириной и высотой
     * @param width - ширина доски
     * @param height - высота доски
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}