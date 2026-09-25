package Q2;

import java.util.ArrayList;

public abstract class Conta {
//atributos
    private String numeroConta;
    private String titular;
    private double saldo; 
    private ArrayList<String> extrato;
//construtor
    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
        this.extrato.add("Abertura da conta");
    }
//métodos concretos
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public double depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }
        this.extrato.add("Deposito de \t"+valor);
        return this.saldo;
    }
    public double sacar(double valor){
        if(valor>0 && this.saldo>=valor){
            this.saldo -= valor;
        }
        this.extrato.add("Saque de \t"+valor);
        return this.saldo;
    }
    public double taxar(double valor, String tipo){
        if(valor>0 && this.saldo>=valor){
            this.saldo -= valor;
        }
        this.extrato.add(tipo+":\t"+valor);
        return this.saldo;
    }
//métodos abstratos
    public abstract void aplicarTaxaMensal();
}
