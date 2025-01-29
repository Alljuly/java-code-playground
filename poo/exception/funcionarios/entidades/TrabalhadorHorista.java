public class TrabalhadorHorista extends Trabalhador{
    public double horasTrabalhadas;
    public double salarioHora;


    public TrabalhadorHorista(
        double salarioHora,
        double horasTrabalhadas,
        int matricula,
        String nome,
        int idade,
        String endereco
        )
        {
            super(matricula, nome, idade, endereco);
            this.salarioHora = salarioHora;
            this.horasTrabalhadas = horasTrabalhadas;
            setSalario();

        }

    @Override
    void setSalario(){
        this.salario = horasTrabalhadas * salarioHora;
    }

}   