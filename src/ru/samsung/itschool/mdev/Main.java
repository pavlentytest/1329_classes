package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {
	    Car opel = new Car();
        opel.setPower(200); // opel.power = 200;
        int s = opel.getMaxspeed();

        Car bmw = new Car();
        bmw.setColor("Red");
        bmw.setMaxspeed(200);

        ElectroCar tesla = new ElectroCar();
        tesla.setColor("Blue");
        tesla.setPower(500);
        tesla.setBatteryCapacity(240.56);

        Car audi = new Car("A6",250,"White",300);

        ElectroCar smart = new ElectroCar("Smart");
        smart.doBeep();

        SuperElectroCar leaf = new SuperElectroCar();
        leaf.doBeep();


        Car car = new Car();

        Object object = new Object();

        // SOLID
        // https://ru.wikipedia.org/wiki/SOLID_(%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BD%D0%BE-%D0%BE%D1%80%D0%B8%D0%B5%D0%BD%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)


        //int, double, char, boolean

        //Integer, Double, Character, Boolean

        Integer myint = new Integer(4);
        Integer myint2 = 3; // объект
        int k = myint2; // простой
        Double mydb = 45.5;
        double d = 933.44;
        mydb = d;


    }
}
