package ru.netology.radio;

public class Radio {

    private int amountStation = 10;
    private int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentStation;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxRadioStation = minRadioStation + amountStation - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void nextStation() {
        if (currentStation == maxRadioStation) {
            currentStation = minRadioStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == minRadioStation) {
            currentStation = maxRadioStation;
            return;
        }
        currentStation--;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}



