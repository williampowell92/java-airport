package airport_challenge;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirportTest {
    private Airport airport;
    private Plane plane;

    @BeforeEach
    void setup() {
        airport = new Airport();
        plane = mock(Plane.class);
    }

    @Test
    void noPlanesOnCreation() {
        assertTrue(airport.getPlanes().isEmpty());
    }

    @Test
    void airportCanLandPlanes() {
        List<Plane> testPlanes = new ArrayList<>();
        testPlanes.add(plane);
        when(plane.isFlying()).thenReturn(true);
        airport.land(plane);

        assertEquals(airport.getPlanes(), testPlanes);
    }
}
