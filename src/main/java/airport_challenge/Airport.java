package airport_challenge;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private final List<Plane> planes = new ArrayList<>();
    private int capacity = 20;

    List<Plane> getPlanes() {
        return planes;
    }

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void land(Plane plane, Weather weather) throws AirportException {
        if (weather.isStormy()) throw new AirportException("It's too stormy!");
        planes.add(plane);
    }

    void takeOff(Plane plane) {
        planes.remove(plane);
    }
}
