public abstract class Conta implements IConta{
    private int agencia;
    private int num;
    private double saldo;



    @Override
    public void sacar(double valor){
       
    }
    @Override
    public void depositar(double valor){
       
    }
    @Override
    public void transferir(double valor, int agenciaDestino, int numeroDestino){
       
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