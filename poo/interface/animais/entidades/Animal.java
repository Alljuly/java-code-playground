abstract class Animal {
    String nome;
    int idade;
    double peso;
    double tamanho;

    public Animal(
        String nome,
        int idade,
        double peso, 
        double tamanho)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public String getNome(){
        return nome;
    }
}