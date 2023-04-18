public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {

            newCurrentStation = 9;
        }
        if (newCurrentStation > 9) {

            newCurrentStation = 0;
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
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public int currentVolumeLevel;

    public int getCurrenVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel > 100) {

            newCurrentVolumeLevel = 100;
        }
        if (newCurrentVolumeLevel < 0) {

            newCurrentVolumeLevel = 0;
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

