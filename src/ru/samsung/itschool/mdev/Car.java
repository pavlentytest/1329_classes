package ru.samsung.itschool.mdev;

public class Car {
    protected String name;
    protected int maxspeed;
    protected String color;
    protected double power;

    public void doBeep() {
        System.out.println("Beep!!!");
    }

    Car() {

    }

    public Car(String name, int maxspeed, String color, double power) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.color = color;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
