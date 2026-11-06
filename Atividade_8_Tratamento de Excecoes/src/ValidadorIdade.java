public class ValidadorIdade {
    static void verificarIdade(int idade){
        if(idade<18){
            throw new IllegalArgumentException("Idade não permitida: Menor de 18 anos.");
        } else {
            System.out.println("Acesso permitido.");
        }
    }
}
