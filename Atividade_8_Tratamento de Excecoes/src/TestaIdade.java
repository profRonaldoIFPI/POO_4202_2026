public class TestaIdade {
    public static void main(String args[]){
        try{
            ValidadorIdade.verificarIdade(19);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do programa.");
    }
}
