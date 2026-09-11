import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Formas2d d = new Formas2d(); //

        Quadrado q = new Quadrado(5);
        Circulo c = new Circulo(2.5);

        ArrayList<Formas2d> formas = new ArrayList<>();
        formas.add(c);
        formas.add(q);
//generalização 
        for (Formas2d forma : formas) {
            System.out.println("Área: "+ forma.getArea());
            System.out.println("Perímetro: "+ forma.getPerimetro());
        }
// DOWNCASTING
    }
}
