public class Cachorro extends Animal implements PodeAndar, PodeNadar{

    public Cachorro(){
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