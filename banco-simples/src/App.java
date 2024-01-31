import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       Banco banco = new Banco("Meu banco");
       int opcao;
       do {
           System.out.println("Menu:");
           System.out.println("1. Criar Conta Poupança");
           System.out.println("2. Criar Conta Corrente");
           System.out.println("3. Sair");
           System.out.print("Escolha uma opção: ");
           opcao = scanner.nextInt();

           switch (opcao) {
               case 1:
                   banco.criarCP();
                   System.out.println("Conta Poupança criada com sucesso!");
                   break;
               case 2:
                  
                   banco.criarCC();
                   System.out.println("Conta Corrente criada com sucesso!");
                   break;
               case 3:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida! Tente novamente.");
           }
       } while (opcao != 3);
       scanner.close();
   }
       
}