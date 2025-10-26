package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        }else{
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }
    public void accelerate() {
        int increment = 20; //
        if (speedometer + increment > MAX_SPEED) {
            speedometer = MAX_SPEED;
            System.out.println("Se alcanzó la velocidad máxima: " + MAX_SPEED);
        } else {
            speedometer += increment;
            System.out.println("Velocidad actual: " + speedometer);
        }
    }

    public void brake(){
        int decrement = 5;
        if (speedometer - decrement < 0) {
            speedometer = 0;
            System.out.println("Velocidad reducida a 0, no puede ser negativa");
        } else {
            speedometer -= decrement;
            System.out.println("Velocidad actual: " + speedometer);
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle > 45) {
            wheelsAngle = 45;
            System.out.println("Ángulo máximo alcanzado (45º)");
        } else if (angle < -45) {
            wheelsAngle = -45;
            System.out.println("Ángulo mínimo alcanzado (-45º)");
        } else {
            wheelsAngle = angle;
            System.out.println("Volante girado a: " + wheelsAngle + " grados");
        }
    }

    public String showSteeringWheelDetail(){

        return "Ángulo actual del volante: " + wheelsAngle + "°";
    }

    public boolean isReverse(){

        return false;
    }

    public void setReverse(boolean reverse){
        if (speedometer > 0) {
            System.out.println("No se puede poner marcha atrás en movimiento hacia adelante");
            return;
        }
        this.reverse = reverse;
        if (reverse) {
            gear = "R";
            System.out.println("Marcha atrás activada");
        } else {
            gear = "N";
            System.out.println("Marcha neutral activada");
        }
    }

    public void showDetails(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Combustible: " + fuel);
        System.out.println("Velocidad: " + speedometer);
        System.out.println("Tacómetro: " + tachometer);
        System.out.println("Ángulo de ruedas: " + wheelsAngle);
        System.out.println("Marcha: " + gear);

    }

    public boolean isTachometerGreaterThanZero() {

        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {

        return this.tachometer == 0;
    }

    public static void main(String[] args) {

    }


}
