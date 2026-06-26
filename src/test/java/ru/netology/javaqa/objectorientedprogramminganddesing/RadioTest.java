package ru.netology.javaqa.objectorientedprogramminganddesing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldIncreaseVolume() {
        RadioTest service = new RadioTest();

        int currentVolume = 5;
        int currentIncreaseVolume = 1;

        for (int i = 1; i <= 100; i++) {
            if (i > 100) {
                currentVolume = 0;
            } else {
                currentVolume = i;
            }

            int expected = 6;
            int actual = service(currentVolume, currentIncreaseVolume);

            Assertions.assertEquals(expected, actual);
            // Ни чего не получается с тестом((.Наверное я зря затеяла учёбу.
            //Подозреваю,что у меня тут полная ахинея.Что же будет дальше.
            //Хочется до всего доходить самой.Ликование,если получается, а тут.....
            //Помогите пожалуйста, ну что же я всё делаю не так.Надо догонять одногруппников.
        }

    }



}