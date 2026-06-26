package ru.netology.javaqa.objectorientedprogramminganddesing;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }



    int currentIncreaseVolume;

    public void setCurrentIncreaseVolume(int newCurrentIncreaseVolume) {

        if (newCurrentIncreaseVolume < 100) {
            return;

        }
        if (newCurrentIncreaseVolume > 100) {
            return;
        }
        currentIncreaseVolume = newCurrentIncreaseVolume;

    }

    public void decreaseVolume() {

        if (currentVolume > 1) {
            currentIncreaseVolume = currentVolume - 1;

        }

    }
}
