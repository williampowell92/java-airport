package airport_challenge;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    private Weather weather;

    @BeforeEach
    void setUp() {
        weather = new Weather();
    }

    @Test
    void returnsTrueToStormy() {
        assertTrue(weather.isStormy());
    }
}
