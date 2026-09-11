package Aula30;

public class Cliente {
    private String nome;
    public Ticket entrada;
    private double valor;

    //construtor
    public Cliente(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    //gets e sets
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }


    public void calculo(){
        if(entrada != null){
            System.out.println("desconto anunciado: " + entrada.desconto);
            double novovalor = entrada.desconto * valor;
            System.out.println("O valor do ticket é: " + novovalor + "; E o tipo do ticket é: " + entrada + "; o ticket vem com " + entrada.codigo);
        }
        else
            System.out.println("Ticket não inserido");
        
    }

}
