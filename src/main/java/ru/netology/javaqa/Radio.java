package ru.netology.javaqa;

public class Radio {
    public int DownChanel;
    public int setChanel;
    public int UpVolume;
    public int DownVolume;
    public int UpChanel;
    private final int minStation = 0;
    private final int maxStation = 9;
    private final int maxVolume = 100;

    public void setChanel(int numberChanel) {
        int station;
        if (numberChanel <= maxStation) {
            station = numberChanel;
        }

        if (numberChanel >= minStation) {
            station = numberChanel;
        }
    }

    public void UpChanel(int Station) {
        if (Station == maxStation) {
            Station = minStation;
        } else {
            Station = Station + 1;
            return;
        }
    }

    public void DownChanel(int Station) {
        if (Station == minStation) {
            Station = maxStation;
        } else {
            Station = Station - 1;
            return;
        }
    }

    public void UpVolume(int volume) {
        if (volume != maxVolume) {
            volume = volume + 1;
            return;
        }
    }

    public void DownVolume(int volume) {
        int minVolume = 0;
        if (volume != minVolume) {
            volume = volume - 1;
            return;
        }
    }

    public int getMinVolume() {
        int minVolume = 0;
        return minVolume;
    }
}