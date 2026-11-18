package ExercicioProjeto1;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private double preco;

    public Livro(String titulo, String autor, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setPaginas(paginas);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0) {
            this.paginas = paginas;
        } else {
            System.out.println("Aviso: valor inválido para páginas (" + paginas + "). Deve ser maior que 0. Valor mantido: " + this.paginas);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Aviso: valor inválido para preço (" + preco + "). Deve ser maior ou igual a 0. Valor mantido: " + this.preco);
        }
    }

    public void exibirFicha() {
        System.out.printf("Livro: %s | Autor: %s | %d páginas | R$ %.2f%n",
                getTitulo(), getAutor(), getPaginas(), getPreco());
    }
}