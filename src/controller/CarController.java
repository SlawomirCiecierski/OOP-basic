package controller;

import model.Car;

public class CarController {
    Car[] cars = new Car[100];
    //składowe statyczne
    private static int indeks = 0;

    public static int getIndeks(){
        return indeks;
    }

    public static void incrementIndeks(){
        indeks++;
    }

    public void purchaseCar(String brand, String model, double price, int year) {
        Car c = new Car(brand, model, price, year);
        cars[indeks] = c;
        incrementIndeks();
    }

    public void getCars() {
        for (int i = 0; i < getIndeks(); i++)
            System.out.println(cars[i]);

    }

}
