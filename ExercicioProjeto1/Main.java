package ExercicioProjeto1;

public class Main {
    public static void main(String[] args) {
        // Criando os livros já com os valores (construtor completo)
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 265, 39.90);
        Livro livro2 = new Livro("Capitães da Areia", "Jorge Amado", 390, 300.00);

        livro1.exibirFicha();
        livro2.exibirFicha();

        livro1.setPaginas(-5);
        livro1.exibirFicha();

        livro1.setPreco(45.50);
        livro1.exibirFicha();

        livro2.setPreco(-10);
        livro2.exibirFicha();
    }
}