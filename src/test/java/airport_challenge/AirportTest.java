package airport_challenge;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AirportTest {
    private Airport airport;

    @BeforeEach
    void setup() { airport = new Airport(); }

    @Test
    void noPlanesOnCreation() {
        assertTrue(airport.getPlanes().isEmpty());
    }
}
