import java.util.ArrayList;
import java.util.List;

public class Banco {
  public String nome;
  public  List <Conta> contas = new ArrayList<>();


  public Banco(String nome){
    this.nome = nome;
  }
  Conta conta;

  public void criarCP(){
    this.conta = new ContaPoupanca();
    contas.add(conta);
  }

  public void criarCC(){
    this.conta = new ContaCorrente();
    contas.add(conta);
  }

}