import java.util.Scanner;
import java.util.ArrayList;
public class Teste{
    public string void main (String[] args){
        Scanner e = new Scanner(System.in);
        ArrayList<Objeto> objetos = new ArrayList<>()


        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Adicionar um Círculo;");
            System.out.println("2. Adicionar um Retângulo;");
            System.out.println("3. Calcular média das áreas;");
            System.out.println("4. Calcular média dos perímetros;");
            System.out.println("0. Sair;");
            System.out.println("================");

            int opc =  e.nextInt();


            switch(opc){
                case 1: 
                    System.out.println("Qual o raio do circulo?");
                    double aux = e.nextDouble();
                    Objeto c = new Circulo(aux);

                    objetos.add(c);

                case 2: 
                    System.out.println("Qual a base do retangulo?");
                    double b = e.nextDouble();

                    System.out.println("Qual altura do retangulo?");
                    double h = e.nextDouble();

                    Objeto r = new Circulo(b,h);

                    objetos.add(b); 
                
                case 3:
                    if(!objetos.isEmpty()){
                        double avgArea = 0;
                        for(Objeto obj : objetos){
                            avgArea += obj.calcArea();
                        }

                        avgArea /= objetos.size();
                        System.out.println("A lista de Objetos Geometricos possui " 
                        + objetos.size() + "itens, a média das áreas desses objetos é de: " 
                        + avgArea);
                    } else {
                        System.out.println("Lista vazia");
                    }

                } 
                case 4:
                    if(!objetos.isEmpty()){
                        double avgPerimetro = 0;
                        for(Objeto obj : objetos){
                            avgArea += obj.calcPerimetro();
                        }

                        avgPerimetro /= objeto.size()
                        System.out.println("A lista de Objetos Geometricos possui " 
                        + objetos.size() + "itens, a média das áreas desses objetos é de: " 
                        + avgPerimetro);
                    } else {
                        System.out.println("Lista vazia");
                    }

                }    

        } while(opc != 0)
    
    }

}