public class Pessoa {
    private int idade; //+18
    
    public Pessoa(int idade){
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalArgumentException{
        if(idade < 18){
            throw new IllegalArgumentException("Apenas maiores de 18 anos.");
        } else {
            this.idade = idade;
        }
    }
}
