package airport_challenge;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    private Plane plane;

    @BeforeEach
    void setup() {
        plane = new Plane();
    }

    @Test
    void planeIsFlying() {
        assertTrue(plane.isFlying());
    }

    @Test
    void PlaneNotFlyingAfterLanding() throws PlaneException {
        plane.land();
        assertFalse(plane.isFlying());
    }

    @Test
    void LandedPlaneCannotLand() throws PlaneException {
        plane.land();
        assertThrows(PlaneException.class, () -> plane.land(), "Plane already landed");
    }

    @Test
    void isFlyingAfterTakeoff() throws PlaneException {
        plane.land();
        plane.takeOff();
        assertTrue(plane.isFlying());
    }

    @Test
    void FlyingPlaneCannotTakeoff() {
        assertThrows(PlaneException.class, () -> plane.takeOff(), "Plane already flying");
    }
}
