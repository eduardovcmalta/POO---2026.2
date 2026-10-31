package Aula89;
import java.util.ArrayList;
public class Leitor {
    private String nome;
    private int matricula;
    private int idade;
    private boolean bloqueado = false;
    private ArrayList<Livro> Livrosemprestados;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public ArrayList<Livro> getLivrosemprestados() {
        return Livrosemprestados;
    }
    public void setLivrosemprestados(ArrayList<Livro> livrosemprestados) {
        Livrosemprestados = livrosemprestados;
    }
    
    public Leitor(String nome, int matricula, int idade, boolean bloqueado, ArrayList<Livro> Livrosemprestados){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.bloqueado = bloqueado;
        this.Livrosemprestados = Livrosemprestados;
    }

    public void emprestar(Livro livro){
        if(livro.isDisponivel() && !this.isBloqueado()){
            this.Livrosemprestados.add(livro);
            livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);

            if(livro.getQtdDisponivel() == 0){
                livro.setDisponivel(false);
            }

            System.out.println("Livro emprestado com sucesso!");
        }else{
            System.out.println("Nao foi possivel emprestar, verifique a disponibilidade.");
        }
    }

    public void devolver(int codigo){
        for(int i = 0; i < this.Livrosemprestados.size(); i++){
            Livro livro = this.Livrosemprestados.get(i);

            if(livro.getCodigo() == codigo){
                this.Livrosemprestados.remove(i);

                livro.setQtdDisponivel(livro.getQtdDisponivel() + 1);
                livro.setDisponivel(true);

                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }

        System.out.println("Livro nao encontrado nos emprestimos deste leitor.");
    }
    public void consultarEmprestimo() {
        System.out.println("--- Livros Emprestados ---");

        // Verifica se a lista está vazia para dar um feedback mais amigável
        if (this.Livrosemprestados.isEmpty()) {
            System.out.println("O leitor não possui livros emprestados no momento.");
            return;
        }

        // Percorre o ArrayList de livros emprestados e apresenta os dados[cite: 6]
        for (Livro livro : this.Livrosemprestados) {
            // Podes ajustar o que é impresso consoante os teus métodos get
            System.out.println("Título: " + livro.getTitulo() + 
                               " | Código: " + livro.getCodigo() + 
                               " | Autor: " + livro.getAutor());
        }
    }
}
