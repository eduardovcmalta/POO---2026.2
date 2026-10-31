package GQ1;

public class Prova {
    private String situacao;
    private String conteudo;
    private double nota;

    public String GetSituacao(){
        return situacao;
    }
    public void SetSituacao(String situacao){
        this.situacao = situacao;
    }
    public String GetConteudo(){
        return conteudo;
    }
    public void SetConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public Double GetNota(){
        return nota;
    }
    public void SetNota(double nota){
        this.nota = nota;
    }

    public Prova(String situacao, String conteudo, double nota){
        this.situacao = situacao;
        this.conteudo = conteudo;
        this.nota = nota;
    }
}
