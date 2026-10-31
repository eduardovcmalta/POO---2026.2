package Aula89;

import java.util.ArrayList;

public class LeitorPremium extends Leitor{
    private int pontos;
    private int TotaldeEmprestimosRealizados;
    
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public int getTotaldeEmprestimosRealizados() {
        return TotaldeEmprestimosRealizados;
    }
    public void setTotaldeEmprestimosRealizados(int totaldeEmprestimosRealizados) {
        TotaldeEmprestimosRealizados = totaldeEmprestimosRealizados;
    }

    public LeitorPremium(String nome, int matricula, int idade, boolean bloqueado, ArrayList<Livro> Livrosemprestados, int pontos, int totaldeEmprestimosRealizados){
        super(nome, matricula, idade, bloqueado, Livrosemprestados);
        this.pontos = pontos;
        this.TotaldeEmprestimosRealizados = totaldeEmprestimosRealizados;
    }

    @Override 
    public void emprestar(Livro livro){
        boolean sucesso = livro.isDisponivel() && !this.isBloqueado();

        super.emprestar(livro);

        if(sucesso) {
            this.TotaldeEmprestimosRealizados++;

            if(this.TotaldeEmprestimosRealizados % 5 == 0) { 
                this.pontos += 10;
                System.out.println("Bonus alcancado: 10 ponos adicionados a sua conta!");
            }
        }
    }
}
