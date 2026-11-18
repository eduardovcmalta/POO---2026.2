package Aula89;
public class LeitorPremium extends Leitor {
    private int pontos;
    private int totalEmprestimos;

    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getTotalEmprestimos(){
        return totalEmprestimos;
    }
    public void setTotalEmprestimos(int totalEmprestimos){
        this.totalEmprestimos = totalEmprestimos;
    }

   public LeitorPremium(String nome, int matricula, int idade, boolean bloqueado,
    int pontos, int totalEmprestimos){
        super(nome, matricula, idade, bloqueado);
        this.pontos = pontos;
        this.totalEmprestimos = totalEmprestimos;
    }

    @Override 
    public void emprestar(Livro livro){
        int antes = getLivrosEmprestados().size();

        super.emprestar(livro);

        if(getLivrosEmprestados().size() > antes){
            totalEmprestimos++;
            if(totalEmprestimos % 5 == 0){
                pontos += 10;
            }
        }
    }

    public void emprestar(Livro livro, int qtdPontosEmprestimoEspecial){
        if(isBloqueado()){
            System.out.println("O leitor esta bloqueado e nao pode realizar o emprestimo.");
        }else if(!livro.isDisponivel()){
            System.out.println("O livro nao esta disponivel");
        }else if(getPontos() < qtdPontosEmprestimoEspecial){
            System.out.println("O autor nao tem pontos o suficientes para realizar  o emprestimo");
        }else{
            pontos -= qtdPontosEmprestimoEspecial;
            getLivrosEmprestados().add(livro);
            livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);
            if(livro.getQtdDisponivel() == 0){
                livro.setDisponivel(false);
            }
        }
    }
}
