package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void UpChanelMaxStation() {
        Radio rad = new Radio();
        rad.UpChanel(9);
        int actual = rad.UpChanel;
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void DownChanel() {
        Radio rad = new Radio();
        rad.UpChanel(0);
        int actual = rad.DownChanel;
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void setChanel() {
        Radio rad = new Radio();
        rad.setChanel(9);
        int actual = rad.setChanel;
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void UpVolume() {
        Radio rad = new Radio();
        rad.UpVolume(20);
        int actual = rad.UpVolume;
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void DownVolume() {
        Radio rad = new Radio();
        rad.DownVolume(0);
        int actual = rad.DownVolume;
        Assertions.assertEquals(0, actual);
    }
}