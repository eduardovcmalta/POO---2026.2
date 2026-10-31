package Aula89;

public class Livro {
    private String titulo;
    private int codigo;
    private int qtdDisponivel;
    private double vlrMultaDiaria;
    private boolean disponivel;
    private String autor;
    

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getQtdDisponivel(){
        return qtdDisponivel;
    }
    public void setQtdDisponivel(int qtdDisponivel){
        this.qtdDisponivel = qtdDisponivel;
    }

    public double getVlrMultaDiaria(){
        return vlrMultaDiaria;
    }
    public void setVlrMultaDiaria(double vlrMultaDiaria){
        this.vlrMultaDiaria = vlrMultaDiaria;
    }

    public boolean isDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}
