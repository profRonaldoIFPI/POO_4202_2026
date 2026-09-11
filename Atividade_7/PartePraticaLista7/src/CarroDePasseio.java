public class CarroDePasseio extends Veiculo {
//atributos
    private double potenciaMotor;
//Construtor
    public CarroDePasseio(String placa, String modelo, double valorBase, double potenciaMotor){
        super(placa, modelo, valorBase);
        this.potenciaMotor = potenciaMotor;
    }
//demais métodos
    @Override
    public double calcularLicenciamento(){
        return super.getValorBase() * 0.05 + (potenciaMotor * 15.0);
    }
}
