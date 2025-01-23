public class Pato extends Animal implements PodeAndar, PodeNadar, PodeVoar{

    public Pato(){
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

    @Override
    void PodeVoar(){
        System.out.println("Voando...");
    }

}