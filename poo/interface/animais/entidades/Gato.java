public class Gato extends Animal implements PodeAndar, PodeNadar{

    public Gato(){
        super();
    }

    @Override
    void PodeAndar(){
        System.out.println("Andando...");
    }

    @Override
    void PodeNadar(){
        System.out.println("Nadando...");
    }

}