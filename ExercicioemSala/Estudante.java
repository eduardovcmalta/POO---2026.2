package ExercicioemSala;

public class Estudante {
    protected String nome;
    protected int idade;
    protected double mensalidade;

    public Estudante(String nome, int idade, double mensalidade) {
        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;
    }

    public void exibirMensalidade() {
        System.out.println("Ola, meu nome e: " + nome + ", tenho " + idade
                + " anos e minha mensalidade e R$ " + mensalidade);
    }

    // Gets and Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}