package airport_challenge;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private final List<Plane> planes = new ArrayList<>();

    List<Plane> getPlanes() {
        return planes;
    }

    void land(Plane plane, Weather weather) throws AirportException {
        if (weather.isStormy()) throw new AirportException("It's too stormy!");
        planes.add(plane);
    }

    void takeOff(Plane plane) {
        planes.remove(plane);
    }
}
