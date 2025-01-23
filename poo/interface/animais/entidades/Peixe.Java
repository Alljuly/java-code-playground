public class Peixe extends Animal implements PodeNadar{

    public Peixe(){
        super();
    }

    @Override
    void PodeNadar(){
        System.out.println("Nadando...");
    }

}