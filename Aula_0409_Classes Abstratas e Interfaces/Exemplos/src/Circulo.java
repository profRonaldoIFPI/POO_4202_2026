public class Circulo extends Formas2d{
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double getArea() {
        return Formas2d.PI*raio*raio;
    }
    @Override
    public double getPerimetro() {
        return 2*Formas2d.PI*raio;
    }
}
