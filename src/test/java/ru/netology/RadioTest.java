package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void ShouldLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldLimitStation2() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCurrentRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextStationRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);

        radio.nextStationRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextStationRadio2() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        radio.nextStationRadio();

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextStationRadio3() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        radio.nextStationRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldBeforeStationRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        radio.beforeStationRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldBeforeStationRadio2() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);

        radio.beforeStationRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldBeforeStationRadio3() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        radio.beforeStationRadio();
        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldNextVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.nextVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldNextVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.nextVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldBeforeVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.beforeVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldBeforeVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.beforeVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


}