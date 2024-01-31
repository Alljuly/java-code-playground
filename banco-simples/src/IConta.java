public interface IConta{
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, int agenciaDestino, int numeroDestino);
}