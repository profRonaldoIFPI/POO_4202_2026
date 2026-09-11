public class Quadrado extends Formas2d{
    private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double getArea() {
        return lado*lado;
    }
    @Override
    public double getPerimetro() {
        return lado*4;
    }
}
