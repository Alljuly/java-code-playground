public abstract class Conta implements IConta{
    
    protected static int AGENCIA_PADRAO = 1026;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int num;
    protected double saldo;


    protected Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.num = SEQUENCIAL++;
    }


    @Override
    public String dadosComuns(){
        return "Agencia " +this.agencia+ " Conta " +num+ "\nSaldo Atual: " +saldo;
    }

    @Override 
    public void imprimirExtrato(){

    }

    @Override
    public void sacar(double valor){
       this.saldo -= valor;
    }

    @Override
    public void depositar(double valor){
       this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }



    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return num;
    }
    public double getSaldo(){
        return saldo;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}