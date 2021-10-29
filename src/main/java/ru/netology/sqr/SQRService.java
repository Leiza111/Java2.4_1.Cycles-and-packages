package ru.netology.sqr;

public class SQRService { //новый класс

    public int calculate (int minRange, int maxRange) { // мин.диапазон, макс.диапазон
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= minRange && square <= maxRange) {
                counter++;
            }

        }
        return counter;
    }
}
