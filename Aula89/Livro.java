package Aula89;
//todos os atributos com visibilidade private
//todos os public
//odas as classes com construtores
//Implementar gets e sets em todas as classes
public class Livro {
    private String titulo;
    private int codigo;
    private String autor;
    private int qtdDisponivel;
    private double vlrMultaDiaria;
    private boolean disponivel = true;

    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    
    public int getCodigo(){return codigo;}
    public void setCodigo(int codigo){this.codigo = codigo;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public int getQtdDisponivel(){return qtdDisponivel;}
    public void setQtdDisponivel(int qtdDisponivel){this.qtdDisponivel = qtdDisponivel;}

    public double getVlrMultaDiaria(){return vlrMultaDiaria;}
    public void setVlrMultaDiaria(double vlrMultaDiaria){this.vlrMultaDiaria = vlrMultaDiaria;}

    public boolean isDisponivel(){return disponivel;}
    public void setDisponivel(boolean Disponivel){this.disponivel = Disponivel;}

    public Livro(String titulo, int codigo, String autor, int qtdDisponivel,
        double vlrMultaDiaria, boolean disponivel){
            this.titulo = titulo;
            this.codigo = codigo;
            this.autor = autor;
            this.qtdDisponivel = qtdDisponivel;
            this.vlrMultaDiaria = vlrMultaDiaria;
            this.disponivel = disponivel;
    }
    
}
