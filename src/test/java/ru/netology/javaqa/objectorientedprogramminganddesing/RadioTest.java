package ru.netology.javaqa.objectorientedprogramminganddesing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetVolume(){
        Radio service = new Radio();

        for (int i =-101; i<=101; i++) {
            int currentVolume = i;
            int expected = currentVolume;

            if (expected > 100) {
                expected = 100;
            }
            else if (expected<0){
                expected = 0;
            }
            int actual = service.setVolume(currentVolume);

            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();
        service.setVolume(0);
        for (int i = 0; i <= 100; i++) {
            int currentVolume = i;
            int expected = currentVolume;
            int actual = service.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

            service.incVolume();
        }

    }

    @Test
    public void shouldDecVolume() {
        Radio service = new Radio();
        service.setVolume(100);
        for (int i = 100; i >=-1; i--) {
            int currentVolume = i;
            int expected = currentVolume;
            if (currentVolume < 0) {
                expected = 0;
            }
            int actual = service.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

            service.decreaseVolume();
        }

    }

    @Test
    public void shouldCurrentStation() {
        Radio service = new Radio();

        for (int a = -10; a <= 10; a++) {
            int currentStation = a;
            int expected = currentStation;

            if(currentStation <0){
                expected = 9;
            }else if (currentStation > 9){
                expected = 0;
            }

            int actual = service.setCurrentStation(currentStation);

            Assertions.assertEquals(expected, actual);

        }

    }

    @Test
    public void shouldNextCurrentStation() {
        Radio service = new Radio();

        for (int a = 0; a <= 9; a++) {

            int currentStation = a;
            int expected = currentStation;
            int actual = service.getCurrentStation();

            Assertions.assertEquals(expected, actual);

            service.nextCurrentStation();
        }
    }


    @Test
    public void shouldPreviousCurrentStation() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        for (int c = 9; c >= 0; c--) {

            int currentStation = c;
            int expected = currentStation;
            int actual = service.getCurrentStation();

            Assertions.assertEquals(expected, actual);

            service.previousStation();
        }
    }
    //Застряла.Последние два теста не проходят.Посмотрите пожалуйста,что не так.
}
