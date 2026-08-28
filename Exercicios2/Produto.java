package Exercicios2;

public class Produto {
    private String nome;
    private boolean disponivel;
    private String desc;
    private double valor;

    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;    
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

}
