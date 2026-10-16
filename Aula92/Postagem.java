package Aula92;

public class Postagem extends Publicacao implements Compartilhavel {
    private int quantidadedecompartilhamentos;

    public int getQuantidadedecompartilhamentos(){
        return quantidadedecompartilhamentos;
    }
    public void setQuantidadedecompartilhamentos(int quantidadedecompartilhamentos){
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }
    
    public Postagem(int quantidadedecompartilhamentos,String autor, String conteudo, int curtidas){
        super(autor, conteudo, curtidas);
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }

    public void exibir(){
        System.out.printf("O autor dessa postagem é %s", super.getAutor());
        System.out.printf("O conteudo da publicacao é %s", super.getConteudo());
        System.out.printf("A quantidade de curtidas é um total de %d", super.getCurtidas());
        System.out.printf("A quantidade de comartilhamentos é um total de %d", quantidadedecompartilhamentos);
    }

    public void compartilhar(){
        quantidadedecompartilhamentos += 1;
    }    
}
