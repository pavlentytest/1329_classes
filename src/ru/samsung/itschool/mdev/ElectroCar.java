package ru.samsung.itschool.mdev;

public class ElectroCar extends Car {


    private double batteryCapacity;

    public ElectroCar(String name, int maxspeed, String color, double power, double batteryCapacity) {
        super(name, maxspeed, color, power);
        this.batteryCapacity = batteryCapacity;
    }

    ElectroCar() {

    }

    ElectroCar(String n) {
        this.name = n;
    }

    public void doBeep() {
        System.out.println("Beeeeeeeeep!!!");
    }

    void toDo() {
        this.power = 400;
        this.color = "Red";

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


}
