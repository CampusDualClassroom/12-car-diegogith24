package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Car mycar = new Car("Citroën", "Xsara", "Diesel");
        mycar.tachometer = 0;
        mycar.start();
        mycar.accelerate();
        mycar.brake();
        mycar.turnAngleOfWheels(20);
        mycar.stop();
        mycar.setReverse(true);
        mycar.showDetails();
    }

}