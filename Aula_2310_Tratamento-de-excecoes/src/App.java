public class App {
    public static void main(String[] args) {
        int num[] = {10, 20, 30}; // 0 a 2
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        try{
            Pessoa p = new Pessoa(16);
            System.out.println(num[3]); // ArrayIndexOutOfBoundsException
            System.out.println("depois do erro.");
        } catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("Mensagem: "+erro.getMessage());
            System.out.println("Causa:"+ erro.getCause());
        } catch (IllegalArgumentException erro){
            System.out.println("Mensagem: "+erro.getMessage());
            System.out.println("Causa:"+ erro.getCause());
        }
        System.out.println("Fim do programa.");
    }
}
