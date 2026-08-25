package Exercicios;

public class Sala {
    private String nome;
    private boolean ocupacao;
    private Aluno[] turma;
    private int dia = 0;

    

    //Construtor
    public Sala(String nome, Aluno[] turma){
        this.nome = nome;
        this.turma = turma;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(boolean ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void alternar(){
        if(ocupacao){
            ocupacao = false;
        }else{
            ocupacao = true;
        }
    }
}