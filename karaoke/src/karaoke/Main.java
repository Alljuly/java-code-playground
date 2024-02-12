package alice;
import java.util.Scanner;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner e = new Scanner(System.in)) {
            Karaoke k1 = new Karaoke();
            int opc;
            
            do{
                System.out.println("\n1 - Cadastrar Música \n"
                        + "2 - Vizualizar Música por estilo \n"
                        + "3 - Atualizar responsável por música \n"
                        + "4 - Tocar música \n" 
                        + "5 - Número de musicas já tocadas \n"
                        + "0 - Parar\n");
                opc = e.nextInt();
                
                switch(opc){
 
                    
                    case 1:
                        k1.toAdd();
                        continue;
                    
                    
                    case 2: 
                        k1.showStyle();
                        continue;
                    
                    
                    case 3:
                        k1.updateOwner();
                        continue;
                    
                    
                    case 4:
                        k1.playSong();
                        continue;

                    
                    case 5: 
                        k1.Cont();
                        continue;
                        
                    case 0: 
                        break;
                }
                
            } while (opc != 0) ;
        }
    }
}

