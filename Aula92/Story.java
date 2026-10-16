package Aula92;

public class Story extends Publicacao {
    private int visualizacoes;
    
    public int getVisualizacoes(){
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes){
        this.visualizacoes = visualizacoes;
    }
    public Story(int visualizacoes, String autor, String conteudo, int curtidas){
        super(autor, conteudo, curtidas);
        this.visualizacoes = visualizacoes;
    }

    public void exibir(){
        System.out.printf("O autor dessa postagem é %s", super.getAutor());
        System.out.printf("O conteudo da publicacao é %s", super.getConteudo());
        System.out.printf("A quantidade de curtidas é um total de %d", super.getCurtidas());
        System.out.printf("A quantidade de visualizacoes é um total de %d", visualizacoes);
    }
    public void visualizar(){
        visualizacoes += 1;
    }

}
