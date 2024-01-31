public class ContaCorrente extends Conta{


    public ContaCorrente(){
        super();
    }

   
    public void imprimirExtrato(){
        System.out.println(" ======= Extrato Conta Corrente =======");
        System.out.println(super.dadosComuns());
    }
}