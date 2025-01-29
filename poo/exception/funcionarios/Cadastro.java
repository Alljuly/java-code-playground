public class Cadastro{
    public Trabalhador trabalhador;

    public Cadastro(Class<? extends Trabalhador> t) throws Exception{
        int matricula;
        String nome;
        int idade;
        String endereco;

        System.out.print("Digite a matricula");
        matricula  =  e.nextInt();
        System.out.print("Digite o nome: ");
        nome =  e.nextString();
        System.out.print("Digite a idade");
        idade =  e.nextInt();
        System.out.print("Digite o endereco");
        endereco = e.nextString();

        if(t instanceof TrabalhadorIntegral){
            trabalhador = new TrabalhadorIntegral(matricula,nome,idade,endereco);
           
        } else if(t instanceof TrabalhadorHorista){
            System.out.print("Valor da hora trabalhada: ");
            double salarioHora = e.nextDouble();
            System.out.println("Horas foram trabalhadas: ");
            double horasTrabalhadas = e.nextDouble();
            trabalhador =  new TrabalhadorHorista(salarioHora,horasTrabalhadas,matricula,nome,idade,endereco);
    
    }   
}
    public double getSalarioTrabalhador(){
        return trabalhador.getSalario();
}   

    public double getID(){
        return trabalhador.matricula;
}   

    public String getInfo(){
        return trabalhador.toString();
    }

    public int getIdade(){
        return trabalhador.idade;
    }


}