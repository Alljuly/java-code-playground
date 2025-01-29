import java.util.Scanner;
import java.util.ArrayList;

public class App{
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        ArrayList<Cadastro> cadastros = new ArrayLista<>();

        int opc;
        do{
            System.out.println("• 1- Cadastrar Trabalhador integral");
            System.out.println("• 2 – Cadastrar trabalhador Horista");
            System.out.println("• 3 – Obter salário de um trabalhador (buscar pela matrícula)");
            System.out.println("• 4 – Obter dados de um trabalhador (buscar pela matrícula)");
            System.out.println("• 5 – Obter maior salário entre os trabalhadores integrais");
            System.out.println("• 6 – Obter maior idade entre os trabalhadores horistas");
            System.out.println("• 0 – Encerrar");
            opc = e.nextInt();
            e.nextLine();

            switch (opc) {
                case 1:
                    Cadastro ci = new Cadastro(TrabalhadorIntegral.class);
                    cadastros.add(ci);
                    System.out.println("Novo trabalhador integral cadastado");
                    break;
                case 2 :
                    Cadastro ch = new Cadastro(TrabalhadorHorista.class);
                    cadastros.add(ch);
                    System.out.println("Novo trabalhador horista cadastado");
                    break;

                case 3:
                    if(!cadastros.isEmpty()){
                        System.out.println("Digite a matricula");
                        boolean achado = false;
                        int m = e.nextInt();
                        for(Cadastro c : cadastros){
                            if(c.getID == m){
                                achado = true;
                                double salario = c.getSalarioTrabalhador();
                                System.out.println("O Salário é de " + salario);
                            }
                        }
                        if(!achado){
                            System.out.println("Matricula não encontrada!");
                        }
                    } else {
                        System.out.println("Lista Vazia");
                        }
                        break;
                case 4:
                    if(!cadastros.isEmpty()){
                        System.out.println("Digite a matricula");
                        boolean achado = false;
                         int m = e.nextInt();
                         for(Cadastro c : cadastros){
                            if(c.getID == m){
                                achado = true;
                                c.toString();
                            }
                        }
                            if(!achado){
                                System.out.println("Matricula não encontrada!");
                            }
                        } else {
                            System.out.println("Lista Vazia");
                            }
                        break;
                case 5:
                            
                            break;
                default:
                    break;
            }
        

        }while(opc != 0);
        
    }
}