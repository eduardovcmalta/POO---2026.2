package ExercicioProjeto1;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private double preco;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
        if(paginas > 0){
            this.paginas = paginas;    
        }else{
            System.out.printf("Valor invalido, por favor digite um valor maior do que 0");
            return;
        }
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;    
        }else{
            System.out.printf("Valor invalido, preco tem que ser um valor positivo ou igual a 0");
            return;
        }
    }

    public Livro(String titulo, String autor, int paginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
    }

    public void exibirFicha(){
        System.out.printf("Livro: %s | Autor: %s | %d paginas | R$ %.2f", getTitulo(), getAutor(), getPaginas(), getPreco());
    }



}
