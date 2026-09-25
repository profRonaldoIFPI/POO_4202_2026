package Q2;

public class ContaCorrente extends Conta implements Auditavel, Tributalvel{

//construtor
    public ContaCorrente(String numeroConta, String titular) {
        super(numeroConta, titular);
    }
//metodos sobrescritos
    @Override
    public void aplicarTaxaMensal(){
        super.taxar(15.00, "Taxa mensal");
    }
    @Override 
    public double calcularTributos(){
        return super.getSaldo()*0.01;
    }
    @Override 
    public String gerarRelatorioAuditoria(){
        return 
            "Numero da conta:\t"+super.getNumeroConta()+
            "Titula:\t"+super.getTitular()+
            "Saldo:\t"+super.getSaldo()+
            "Imposto:\t"+calcularTributos();

    }
    
}
