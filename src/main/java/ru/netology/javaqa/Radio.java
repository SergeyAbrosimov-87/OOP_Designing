package ru.netology.javaqa;

public class Radio {


    private int currentVolume;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentStation;
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;

    public Radio() {

    }

    public Radio(int numberOfStations) {
        this.maxCurrentStation = minCurrentStation + numberOfStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxCurrentStation) {
            return;
        }
        if (newCurrentStation < minCurrentStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public void volumeUp() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        }
    }


    public void next() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            currentStation = minCurrentStation;
        }
    }

    public void prev() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            currentStation = maxCurrentStation;
        }
    }

}