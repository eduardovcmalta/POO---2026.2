package Aula2;

public class Pessoa{
    public String nome;
    public int idade;
    public double peso;
    public String sexo;

    public Pessoa(String nome, int idade, double peso, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void apresentacao(){
        if(sexo.equals("masculino"))
            System.out.println("Ola, meu nome e: " + nome + "; minha idade e: " + idade + "; e meu peso e: " + peso);
        if(sexo.equals("feminino"))
            System.out.println("Ola, meu nome e: " + nome + "; minha idade e: " + idade);
    }

    public void conhecer(Pessoa p1){
        apresentacao();
        p1.apresentacao();
        System.out.println("Entao " + this.nome + " e " + p1.nome + " agora se conhecem;");
    }
}