package builder.components;

import builder.cars.Car;

import builder.cars.Car;

public class TripComputer {/*entity of trip computer that have attribute that created by object of Car class and
nevertheless important method of show status that define car aactions*/

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
