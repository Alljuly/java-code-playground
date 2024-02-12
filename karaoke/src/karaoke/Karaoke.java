package alice;
import java.util.ArrayList;
import java.util.Scanner;

public class Karaoke {
    Scanner e = new Scanner(System.in);
    private ArrayList<Music> m1 = new ArrayList<Music>();
    private int cont;
    
    
    public void toAdd(){
        Music music = new Music();
        m1.add(music);
    }
    
    public void showStyle(){
        System.out.println("Qual o estilo?");
        String aux = e.nextLine();
        for(int i = 0; i < m1.size(); i++){
            if(m1.get(i).getStyle().equalsIgnoreCase(aux)){
            m1.get(i).showSong();
        }
        }
    }
    
    public void updateOwner(){
        System.out.println("Titulo da música:");
        String aux = e.nextLine();
        for(int i = 0; i < m1.size(); i++){
            if(m1.get(i).getTitle().equalsIgnoreCase(aux)){
                m1.get(i).updateAuthor();
            }
        }
    }
    
    public void playSong(){
        System.out.println("Qual música?");
        String aux = e.nextLine();
        for(int i = 0; i < m1.size(); i++){
            if(m1.get(i).getTitle().equalsIgnoreCase(aux)){
                m1.get(i).play();
                m1.remove(i);
                cont++;
            }
        }
    }
    
    public int Cont(){
        return cont++;
    }
    
}
