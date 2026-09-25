package Q1;
public abstract class Veiculo {
//atributos que serão herdados pelas subclasses 
    private String placa;
    private String modelo;
    private double valorBase;
//atributos desta classe apenas
    private static int totalVeiculosCadastrados = 0;
    public static final double TAXA_AMBIENTAL = 0.03; //constante
//Método construtor
    public Veiculo(String placa, String modelo, double valorBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorBase = valorBase;
        totalVeiculosCadastrados++;
    }
//Métodos que serão herdados pelas subclasses
    public double calcularTaxaAmbiental(){
        return valorBase*TAXA_AMBIENTAL;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract double calcularLicenciamento();

//Método apenas desta classe 

    public static int getTotalVeiculosCadastrados() {
        return totalVeiculosCadastrados;
    }

}
