public class ContaBancaria {
    private double saldo;
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    } 
    public double getSaldo() {
        return saldo;
    }
    public double sacar(double valor){
        if(valor > this.saldo) throw new SaldoInsuficienteException("Saldo menor que o valor que deseja sacar.");
        else this.saldo -= valor;
        return this.saldo;
    }
}
