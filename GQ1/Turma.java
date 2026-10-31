package GQ1;

public class Turma {
    private int codigo;
    private String entrada;
    private Prova[] provas;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getEntrada() {
        return entrada;
    }
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public Prova[] GetProvas(){
        return provas;
    }

    public Turma(int codigo, String entrada, Prova[] provas){
        this.codigo = codigo;
        this.entrada = entrada;
        this.provas = new Prova[4];
    }
    
    public void SetProvas(int posicao, Prova prova){
        if(posicao >= 0 && posicao < provas.length){
            provas[posicao] = prova;
        }
    }

    public int resultados(){
        int qtdAlunosFinal = 0;
        for(Prova p : provas){
            if(p == null){
                continue;
            }
            double nota = p.GetNota();

            if(nota > 3 && nota <= 7){
                p.SetSituacao("Final");
                qtdAlunosFinal++;
            }
            else if (nota <= 3){
                p.SetSituacao("Reprovado");
            }else{
                p.SetSituacao("Aprovado");
            }
        }
        return qtdAlunosFinal;
    }
}
