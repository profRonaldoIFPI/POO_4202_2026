public class App {
    public static void main(String[] args) throws Exception {

            int[] numeros = new int[10];

            for(int i = 0; i<=9; i++){
                numeros[i] = i+1;
            }
            
            for(int num: numeros){
                System.out.println(num);
            }
    
    





    }




        //     Funcionario f = new Funcionario("Arthur", 3000);
        // f.exibirDados();
        // System.out.println(f.calcularPagamento());

        // Vendedor v = new Vendedor("Fernanda", 2000, 4000);
        // v.exibirDados(); // metodo herdado
        // System.out.println(v.calcularPagamento()); //metodo sobrescrito 
}
