import model.Auto;

public class Main {
    public static void main(String[] args) {
        //utworzenie obiektu klasy
        Auto a1 = new Auto();
        System.out.println("Brand "+a1.brand);
        System.out.println("Model "+a1.model);
        System.out.println("Production "+a1.year);
        System.out.println("Color: "+a1.color);
        System.out.println("Paliwo: "+a1.fuel_type);
        System.out.println("Cena: "+a1.price);
    }
}
