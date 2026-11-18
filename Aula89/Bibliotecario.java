package Aula89;

public class Bibliotecario extends LeitorPremium {
    private String setor;
    private int codigoFuncional;
    private double salario;

    public String getSetor(){return setor;}
    public void setSetor(String setor){this.setor = setor;}

    public int getCodigoFuncional(){return codigoFuncional;}
    public void setCodigoFuncional(int codigoFuncional){this.codigoFuncional = codigoFuncional;}

    public double getSalario(){return salario;}
    public  void setSalario(double salario){this.salario = salario;}

   public Bibliotecario(String nome, int matricula, int idade, boolean bloqueado,
                         int pontos, int totalEmprestimos,
                         String setor, int codigoFuncional, double salario){
        super(nome, matricula, idade, bloqueado, pontos, totalEmprestimos);
        this.setor = setor;
        this.codigoFuncional = codigoFuncional;
        this.salario = salario;
    }

    public void renovarEstoque(Livro livro, int quantidade){
        livro.setQtdDisponivel(livro.getQtdDisponivel() + quantidade);
    }

    public void bloquearLivro(Livro livro){
        livro.setDisponivel(false);
    }

    public void liberarLivro(Livro livro){
        if(livro.getQtdDisponivel() > 0){
            livro.setDisponivel(true);
        }
    }
}
