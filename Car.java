package com.teos;

/**
 * Created by ziemniewiczm on 22.06.2017.
 */
public class Car extends Vechicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean inManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean inManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.inManual = inManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }

}
