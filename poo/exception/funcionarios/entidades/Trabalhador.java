abstract class Trabalhador{
    protected int matricula;
    protected String nome;
    protected double salario;
    protected int idade;
    protected String endereco;


    public Trabalhador(
        int matricula,
        String nome,
        int idade,
        String endereco
    ){
        this.matricula  = matricula;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    protected int getMatricula(){
        return matricula;
    }

    protected void setMatricula(int m){
        this.matricula = m;
    }
    
    protected int getIdade(){
        return idade;
    }

    protected void setIdade(int i){
        this.idade = i;
    }

    protected String getNome(){
        return nome;
    }

    protected void setNome(String n){
        this.nome = n;
    }

    protected String getEndereco(){
        return endereco;
    }

    protected void setEndereco(String e){
        this.endereco = e;
    }

    protected double getSalario(){
        return salario;
    }

    protected void setSalario(double s){
        this.salario = s;
    }

    @Override
    public String toString() {
    return "Cadastro {" +
           "matricula=" + matricula +
           ", nome='" + nome + '\'' +
           ", salario=" + salario +
           ", idade=" + idade +
           ", endereco='" + endereco + '\'' +
           '}';
}
}