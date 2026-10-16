package Aula92;

public class Story extends Publicacao implements Compartilhavel {
    private int visualizacoes;
    private int qtdcompartilhamentos;
    
    public int getVisualizacoes(){
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes){
        this.visualizacoes = visualizacoes;
    }
    
    public int getQtdcompartilhamentos(){
        return qtdcompartilhamentos;
    } 
    public void setQtdcompartilhamentos(int qtdcompartilhamentos){
        this.qtdcompartilhamentos = qtdcompartilhamentos;
    }

    public Story(int visualizacoes, String autor, String conteudo, int curtidas, int qtdcompartilhamentos){
        super(autor, conteudo, curtidas);
        this.visualizacoes = visualizacoes;
        this.qtdcompartilhamentos = qtdcompartilhamentos;
    }

    public void exibir(){
        System.out.printf("O autor dessa postagem é %s", super.getAutor());
        System.out.printf("O conteudo da publicacao é %s", super.getConteudo());
        System.out.printf("A quantidade de curtidas é um total de %d", super.getCurtidas());
        System.out.printf("A quantidade de compartilhamentos é um total de %d", qtdcompartilhamentos);
        System.out.printf("A quantidade de visualizacoes é um total de %d", visualizacoes);
    }
    
    public void visualizar(){
        visualizacoes += 1;
    }
    
    public void compartilhar(){
        qtdcompartilhamentos += 1;
    }
}
