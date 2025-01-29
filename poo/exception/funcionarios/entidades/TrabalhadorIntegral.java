public class TrabalhadorIntegral extends Trabalhador{

    public TrabalhadorIntegral(
        int matricula,
        String nome,
        int idade,
        String endereco
        )
        {
        super(matricula, nome, idade, endereco);
        setSalario();
        }

    @Override
    void setSalario(){
        if(this.idade <= 30){
            this.salario += this.salario * 0.16;
        }
        
        if(this.idade >= 25){
            this.salario += this.salario * 0.25;
        }
    }
    
}   