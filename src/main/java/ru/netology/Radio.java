package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolumeLevel;
    private int totalRadioStationQantity = 10;
    private int maxStation = totalRadioStationQantity - 1;
    private int minStation = totalRadioStationQantity = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio (int setYourOwnStationQuantity) {
        this.totalRadioStationQantity = setYourOwnStationQuantity;
        this.maxStation = setYourOwnStationQuantity - 1;
        this.minStation = setYourOwnStationQuantity = 0;
    }

    public Radio () {
        this.totalRadioStationQantity = totalRadioStationQantity;
    }

    public int getMaxStationNumber() {
        return maxStation;
    }

    public int getMinStationNumber() {
        return minStation;
    }

    public int getCurrentStationNumber() {
        return currentStation;
    }

    public int getCurrenVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public void setNextstation() {
        int newStation = currentStation + 1;
        setCurrentStation(newStation);
    }

    public void setPrevStation() {
        int newStation = currentStation - 1;
        setCurrentStation(newStation);
    }


    public void setCurrentStationDirectly(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel >= maxVolume) {
            newCurrentVolumeLevel = maxVolume;
        }
        if (newCurrentVolumeLevel < minVolume) {
            newCurrentVolumeLevel = minVolume;
        }
        currentVolumeLevel = newCurrentVolumeLevel;
    }

    public void setNextVolumeLevel() {
        int newLevel = currentVolumeLevel + 1;
        setCurrentStation(newLevel);
    }

    public void setPrevVolumeLevel() {
        int newLevel = currentVolumeLevel - 1;
        setCurrentVolumeLevel(newLevel);
    }
}

