package ru.netology.javaqa.objectorientedprogramminganddesing;

public class Radio {

    private int currentStation = 0;
    private int currentVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


    public int setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            currentStation = 9;
        }
        else if (newCurrentStation > 9) {
            currentStation = 0;
        }else {
            currentStation = newCurrentStation;
        }
        return currentStation;
    }

    public void nextCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }

    }



    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }



    public void incVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }




    public int setVolume(int newVolume){
        if (newVolume <=100 && newVolume >= 0){
            currentVolume = newVolume;
        }

        return currentVolume;
    }
}
