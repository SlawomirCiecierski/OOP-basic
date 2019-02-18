package controller;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        //GUI
        Scanner sc = new Scanner(System.in);
        System.out.println("AUTO FACTORY");
        boolean flag = true;
        CarController cc = new CarController();
        while (flag) {
            System.out.println("1. Zamówienie auta \n2. Lista zamówień\n0. Wyjście");
            int decision = sc.nextInt();
            sc.nextLine();

            switch (decision) {
                case 1:
                    System.out.println("Podaj markę: ");
                    String brand = sc.nextLine();
                    System.out.println("Podaj model: ");
                    String model = sc.nextLine();
                    System.out.println("Podaj cenę: ");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rok produkcji: ");
                    int year = sc.nextInt();
                    cc.purchaseCar (brand, model, price, year);
                    break;
                case 2:
                    System.out.println(CarController.getIndeks());
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Błędny wybór!");
            }
        }
    }

}
