package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateNumberOfSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int minRange = 200; //минимальный диапазон
        int maxRange = 300; //максимальный диапазон

        //вызываем целевой метод
        int actual = service.calculate(minRange, maxRange);

        assertEquals(expected, actual);


    }

    @Test
    void shouldCalculateNumberOfSquaresLarger() {
        SQRService service = new SQRService();

        int expected = 6;
        int minRange = 600; //минимальный диапазон
        int maxRange = 900; //максимальный диапазон

        //вызываем целевой метод
        int actual = service.calculate(minRange, maxRange);

        assertEquals(expected, actual);


    }

    @Test
    void shouldCalculateNumberOfSquaresLess() {
        SQRService service = new SQRService();

        int expected = 22;
        int minRange = 0; //минимальный диапазон
        int maxRange = 1000; //максимальный диапазон

        //вызываем целевой метод
        int actual = service.calculate(minRange, maxRange);

        assertEquals(expected, actual);


    }
    @Test
    void shouldCalculateNumberOfSquaresNegative() {
        SQRService service = new SQRService();

        int expected = 0;
        int minRange = -1000; //минимальный диапазон
        int maxRange = 0; //максимальный диапазон

        //вызываем целевой метод
        int actual = service.calculate(minRange, maxRange);

        assertEquals(expected, actual);


    }
}
