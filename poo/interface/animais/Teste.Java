import java.util.Scanner;
import java.util.ArrayList;
public class Teste{
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);
        ArrayList<Animais> animais = new ArrayList<>()


        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Cadastre um Animal;");
            System.out.println("2.Realizar a ação de andar (Para aqueles que possuem essa característica)");
            System.out.println("3. Realizar a ação de nadar (Para aqueles que possuem essa característica)");
            System.out.println("4. Realizar a ação de voar (Para aqueles que possuem essa característica)");
            System.out.println("0. Sair;");
            System.out.println("================");
            int opc = e.nextInt();
            e.nextLine();

            switch(opc){
                case 1: 
                    System.out.println("Qual o animal?\n1- Gato\n2- Cachorro\n3-Pato\nPeixe");
                    int tipo = e.nextInt();
                    e.nextLine();

                    if(tipo >= 1 && tipo <= 4){

                        System.out.println("Nome do animal: ");
                        String nome = e.nextLine();
                        System.out.println("Idade do animal: ");
                        int idade = e.nextInt();
                        System.out.println("Peso do animal: ");
                        double peso = e.nextDouble();
                        System.out.println("Tamanho do animal: ");
                        double tamanho = e.nextDouble();

                        Animais a = null;

                        if (tipo == 1) a = new Gato(nome, idade, peso, tamanho);

                        if (tipo == 2) a = new Cachorro(nome, idade, peso, tamanho);

                        if (tipo == 3) a = new Pato(nome, idade, peso, tamanho);
                        
                        if (tipo == 4) a = new Peixe(nome, idade, peso, tamanho);

                        animais.add(a);

                    } else {
                        throw new Exception("Escolha invalida");
                    }

                    break;
                
                case 2:
                    if(!animais.isEmpty()){
                        for(Animais a : animais){
                            if(a instanceof PodeAndar){
                                ((PodeAndar) a).andar();
                            }
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    
                    break;

                case 3:
                    if(!animais.isEmpty()){
                        for(Animais a : animais){
                            if(a instanceof PodeNadar){
                                System.out.println("Nome: " + a.getNome());
                                ((PodeNadar) a).nadar();
                            }
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    
                    break;

                case 4:
                    if(!animais.isEmpty()){
                        for(Animais a : animais){
                            if(a instanceof PodeVoar){
                                System.out.println("Nome: " + a.getNome());
                                ((PodeVoar) a).voar();
                            }
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    
                    break;
            }

    } while(opc != 0 )
}
}