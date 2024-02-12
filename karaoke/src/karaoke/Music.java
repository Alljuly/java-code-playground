package alice;
import java.util.Scanner;

public class Music {
    Scanner e = new Scanner(System.in);
    private String title, time, realesed, style;
    private Author owner;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRealesed() {
        return realesed;
    }

    public void setRealesed(String realesed) {
        this.realesed = realesed;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    
    public Music(){
        System.out.println("Titulo: ");
        title = e.nextLine();
        System.out.println("Duração: ");
        time = e.nextLine();
        System.out.println("Lançamento: ");
        realesed = e.nextLine();
        System.out.println("Estilo: ");
        style = e.nextLine();

        owner = new Author();

    }
    
    public void add(){
        System.out.println("Titulo: ");
        title = e.nextLine();
        System.out.println("Duração: ");
        time = e.nextLine();
        System.out.println("Lançamento: ");
        realesed = e.nextLine();
        System.out.println("Estilo: ");
        style = e.nextLine();

        owner = new Author();
    }
    
    public void showSong(){
        System.out.println("\nTitulo: "+title+""
            + "\nDuração: \n"+time+""
                + "\nLançamento: "+realesed+""
                   + "\nEstilo: "+style);
    }
    
    public void play(){
        System.out.println("\nTitulo: "+title+""
            + "\nDuração: "+time+""
                + "\nLançamento: "+realesed+""
                   + "\nEstilo: "+style);
        owner.show();
        System.out.println("");
            System.out.println("\n----------- MÚSICA EM EXECUÇÃO! ----------- \n");
    }
    
    public void updateAuthor(){
        owner.updateOwner();
        System.out.println("\n----------- Responsável Atualizado! -----------\n");
    }
    
    
}
