package ru.netology;

public class Radio {

    private int currentRadio;
    private int currentVolume;


    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        int minRadio = 0;
        int maxRadio = 9;

        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void nextStationRadio() {
        int nextStationRadio = currentRadio + 1;
        int minRadio = 0;
        int maxRadio = 9;

        if (nextStationRadio > maxRadio) {
            currentRadio = minRadio;
        }
    }

    public void beforeStationRadio() {
        int beforeStationRadio = currentRadio - 1;
        int minRadio = 0;
        int maxRadio = 9;

        if (beforeStationRadio < minRadio) {
            currentRadio = maxRadio;
        }
    }

    public void setCurrentVolume(int newVolume) {
        int minVolume = 0;
        int maxVolume = 10;
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;

    }

    public void nextVolume() {
        int maxVolume = 10;
        int nextVolume = currentVolume + 1;
        int v = currentVolume + 1;

        if (v > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = nextVolume - 1;
        }

    }

    public void beforeVolume() {
        int minVolume = 0;
        int beforeVolume = currentVolume - 1;
        int v = currentVolume - 1;
        if (v < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = beforeVolume + 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


}


