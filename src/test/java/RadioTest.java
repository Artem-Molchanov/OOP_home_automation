import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetMaxStationDirectly () {
        Radio radio = new Radio();

        radio.setCurrentStationDirectly(9);


        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinStationDirectly () {
        Radio radio = new Radio();

        radio.setCurrentStationDirectly(0);


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetAboveMaxStationDirectly() {
        Radio radio = new Radio();

        radio.setCurrentStationDirectly(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetUnderMinStationDirectly() {
        Radio radio = new Radio();

        radio.setCurrentStationDirectly(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroAboveMaxViaButton() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setNextstation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNineUnderMinViaButton() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeAboveMaxViaButton() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(101);

        radio.setNextVolumeLevel();

        int expected = 100;
        int actual = radio.getCurrenVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMinViaButton() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(-1);

        radio.setPrevVolumeLevel();

        int expected = 0;
        int actual = radio.getCurrenVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}
