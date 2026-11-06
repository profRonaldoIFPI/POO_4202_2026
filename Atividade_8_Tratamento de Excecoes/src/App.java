public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(150);
        System.out.println("Conta criada com sucesso!");
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Realizando saque.");
        try{
            System.out.println("Saldo: "+conta.sacar(200));
        } catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Saldo: "+conta.sacar(100));
        } catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizado!");
    }
}