package airport_challenge;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private final List<Plane> planes = new ArrayList<>();

    List<Plane> getPlanes() {
        return planes;
    }

    void land(Plane plane) {
        planes.add(plane);
    }
}
