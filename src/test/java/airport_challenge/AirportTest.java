package airport_challenge;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirportTest {
    private Airport airport;
    private Plane flyingPlane;
    private Plane landedPlane;
    private Weather calmWeather;
    private Weather stormyWeather;

    @BeforeEach
    void setup() {
        airport = new Airport();
        flyingPlane = mock(Plane.class);
        landedPlane = mock(Plane.class);
        calmWeather = mock(Weather.class);
        stormyWeather = mock(Weather.class);
        when(flyingPlane.isFlying()).thenReturn(true);
        when(landedPlane.isFlying()).thenReturn(false);
        when(calmWeather.isStormy()).thenReturn(false);
        when(stormyWeather.isStormy()).thenReturn(true);
    }

    @Test
    void shouldHaveDefaultCapacityOfTwenty() {
        assertEquals(airport.getCapacity(), 20);
    }

    @Test
    void settingCapacityShouldChangeCapacity() {
        airport.setCapacity(30);
        assertEquals(airport.getCapacity(), 30);
    }

    @Test
    void noPlanesOnCreation() {
        assertTrue(airport.getPlanes().isEmpty());
    }

    @Test
    void airportCanLandPlanes() throws AirportException {
        List<Plane> testPlanes = new ArrayList<>();
        testPlanes.add(flyingPlane);
        airport.land(flyingPlane, calmWeather);

        assertEquals(airport.getPlanes(), testPlanes);
    }

    @Test
    void cannotLandPlanesInStormyWeather() {
        Executable landInStormyWeather = () -> airport.land(flyingPlane, stormyWeather);
        assertThrows(AirportException.class, landInStormyWeather,"It's too stormy!");
    }

    @Test
    void airportNoLongerContainsPlaneAfterTakeoff() throws AirportException {
        airport.land(flyingPlane, calmWeather);
        airport.takeOff(flyingPlane);

        assertTrue(airport.getPlanes().isEmpty());
    }
}
