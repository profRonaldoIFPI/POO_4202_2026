public class Vendedor extends Funcionario{
// atributos    
    private double comissao;
// construtor
    public Vendedor(String nome, double salarioBase, double comissao){
        super(nome, salarioBase);
        this.comissao = comissao;
    }
// métodos
    @Override //isso é um decoration
    public double calcularPagamento(){ // igual ao getSalarioBase
        return super.getSalarioBase()+comissao;
    }
    
}