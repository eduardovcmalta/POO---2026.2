package Aula89;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Leitor> leitores;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Leitor> getLeitores() {
        return leitores;
    }
    public void setLeitores(ArrayList<Leitor> leitores) {
        this.leitores = leitores;
    }

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.leitores = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarLeitor(Leitor leitor){
        leitores.add(leitor);
    }

    public Livro buscarLivro(int codigo){
        Livro encontrado = null;
        for(int i = 0; i < livros.size(); i++){
            Livro livro = livros.get(i);
            if(livro.getCodigo() == codigo){
                encontrado = livro;
            }
        }
        return encontrado;
    }

    public Leitor buscarLeitor(int matricula){
        Leitor encontrado = null;
        for(int i = 0; i < leitores.size(); i++){
            Leitor leitor = leitores.get(i);
            if(leitor.getMatricula() == matricula){
                encontrado = leitor;
            }
        }
        return encontrado;
    }

    public void ListarLivrosDisponiveis(){
        for(int i = 0; i < livros.size(); i++){
            Livro atual = livros.get(i);
            if(atual.isDisponivel()){
                System.out.println("Obra: " + atual.getTitulo() + " | Autor: " + atual.getAutor()
                + " | Codigo: " + atual.getCodigo() + " | Disponiveis: " + atual.getQtdDisponivel());
            }
        }
    }
}
