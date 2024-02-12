package alice;
import java.util.Scanner;

public class Author {
    Scanner e = new Scanner(System.in);
    private String res;
    private int comp; 
    

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }
    
    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    
    public Author(){
        System.out.println("Responsavel: ");
        res = e.nextLine();
        System.out.println("Número de Compositores ");
        comp = e.nextInt();
    }
    
    public void add(){
        System.out.println("Responsavel: ");
        res = e.nextLine();
        System.out.println("Número de Compositores ");
        comp = e.nextInt();
    }
    
    public void show(){
        System.out.println("\nResponsavel: "+res+""
                + "\nCompositores: "+comp);
    }
    
    public void updateOwner(){
        System.out.println("Responsavel: ");
        res = e.nextLine();
        System.out.println("Número de Compositores ");
        comp = e.nextInt();
    }
    
}
