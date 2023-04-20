package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test

    public void shouldTestSetYourOwnStationQuantity () {
        Radio radio = new Radio(11);

        Assertions.assertEquals(0,radio.getMinStationNumber());
        Assertions.assertEquals(10,radio.getMaxStationNumber());

    }

    @Test

    public void shouldSetMaxStationDirectly () {

        radio.setCurrentStationDirectly(9);


        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinStationDirectly () {

        radio.setCurrentStationDirectly(0);


        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetAboveMaxStationDirectly() {

        radio.setCurrentStationDirectly(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetUnderMinStationDirectly() {

        radio.setCurrentStationDirectly(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroAboveMaxViaButton() {

        radio.setCurrentStation(9);

        radio.setNextstation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNineUnderMinViaButton() {

        radio.setCurrentStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeAboveMaxViaButton() {

        radio.setCurrentVolumeLevel(100);

        radio.setNextVolumeLevel();

        int expected = 100;
        int actual = radio.getCurrenVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMinViaButton() {

        radio.setCurrentVolumeLevel(0);

        radio.setPrevVolumeLevel();

        int expected = 0;
        int actual = radio.getCurrenVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}
