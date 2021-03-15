package builder.builders;

import builder.cars.CarType;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    /*interface class that contains the main elements of builder system of car,in this case,
    * -car type
    * -the amount of seats
    * -engine
    * -transmission system
    * -trip computer
    * -gps system */
}