import model.Auto;

public class Main {
    public static void main(String[] args) {
        //utworzenie obiektu klasy
        Auto a1 = new Auto();
        //odwołanie do pól klasowych
        System.out.println("Brand "+a1.brand);
        System.out.println("Model "+a1.model);
        System.out.println("Production "+a1.year);
        System.out.println("Color: "+a1.color);
        System.out.println("Paliwo: "+a1.fuel_type);
        System.out.println("Cena: "+a1.price);
        a1.brand="BMW";
        a1.model="X5";
        a1.year=2010;
        a1.color="Black";
        a1.fuel_type="Diesel";
        a1.segment='S';
        a1.price=98_000;
        System.out.println(a1);
        //ALT + INS

    }
}
