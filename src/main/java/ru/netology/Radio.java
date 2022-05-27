package ru.netology;

public class Radio {
    private int currentRadio;
    private int currentVolume;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int defaultRadio = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int defaultRadio) {
        this.defaultRadio = defaultRadio;
    }


    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < minRadio) {
            return;
        }
        if (currentRadio > maxRadio) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void nextStation() {
        int nextStation = currentRadio + 1;
        if (nextStation > maxRadio) {
            currentRadio = minRadio;

        }
    }

    public void beforeStation() {
        int beforeStation = currentRadio - 1;
        if (beforeStation < minRadio) {
            currentRadio = maxRadio;

        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            currentVolume = maxVolume;

        }
    }

    public void beforeVolume() {
        int beforeVolume = currentVolume - 1;
        if (beforeVolume < minVolume) {
            currentVolume = minVolume;

        }
    }
}

