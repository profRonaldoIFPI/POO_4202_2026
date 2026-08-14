public class Funcionario {
//atributos
    private String nome;
    private double salarioBase;
//método construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
//métodos do problema proposto
public double calcularPagamento(){ // igual ao getSalarioBase
    return salarioBase;
}

public void exibirDados(){
    System.out.println(
        "Nome:\t"+nome+
        "\nSalario:\t"+salarioBase
    );
}

//métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }    
}
