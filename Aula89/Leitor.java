package Aula89;
import java.util.ArrayList;

public class Leitor {

    private String nome;
    private int matricula;
    private int idade;
    private boolean bloqueado = false;
    private ArrayList<Livro> livrosEmprestados;
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getMatricula(){return matricula;}
    public void setMatricula(int matricula){this.matricula = matricula;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public boolean isBloqueado(){return bloqueado;}
    public void setBloqueado(boolean bloqueado){this.bloqueado = bloqueado;}

    public ArrayList<Livro> getLivrosEmprestados(){return livrosEmprestados;}
    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados){this.livrosEmprestados = livrosEmprestados;}

    public Leitor(String nome, int matricula, int idade, boolean bloqueado){
            this.nome = nome;
            this.matricula = matricula;
            this.idade = idade;
            this.bloqueado = bloqueado;
            this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestar(Livro livro){
        if(isBloqueado()){
            System.out.println("O livro nao pode ser emprestado porque o leitor esta bloqueado.");
        }else if(!livro.isDisponivel()){
            System.out.println("Livro nao esta disponivel, tente novamente mais tarde.");
        }else{
            livrosEmprestados.add(livro);
            livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);
            if(livro.getQtdDisponivel() == 0){
                livro.setDisponivel(false);
            }
            System.out.println("Livro emprestado com sucesso!");
        }

    }
    public void devolver(int codigo){
       Livro encontrado = null;
       for(int i = 0; i < livrosEmprestados.size(); i++){
        Livro livro = livrosEmprestados.get(i);
        if(livro.getCodigo() == codigo){
            encontrado = livro;
            break;
        }
       }
       if(encontrado != null){
        livrosEmprestados.remove(encontrado);
        encontrado.setQtdDisponivel(encontrado.getQtdDisponivel() + 1);
        encontrado.setDisponivel(true);
       }else{
       System.out.println("Livro nao encontrado.");
       }
    }
    public void consultarEmprestimo(){
        if(livrosEmprestados.isEmpty()){
            System.out.println("Nao foi emprestado nenhum livro");
            return;
        }

        for(int i = 0; i < livrosEmprestados.size(); i++){
            Livro atual = livrosEmprestados.get(i);
            System.out.println("Obra: " + atual.getTitulo() + " | Autor: " + atual.getAutor() + " | Codigo: " + atual.getCodigo());
        }
    }
}
