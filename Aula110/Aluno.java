package Aula110;

public class Aluno {
    public String nome;
    public String RA;
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno(String nome, String RA){
        this.nome = nome;
        this.RA = RA;
    }

    public void media(double nota1, double nota2)throws NotaInvalidaException{
        if(nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0){
            NotaInvalidaException excecao = new NotaInvalidaException();
            throw excecao;
        }else{
            nota = (nota1 + nota2) / 2;
        }
    }
    public void matricular() throws RuntimeException;
}
