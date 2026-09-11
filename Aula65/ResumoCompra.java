package Aula65;

public class ResumoCompra {
    private float total;
    private float media;

    public ResumoCompra(float total, float media){
        this.total = total;
        this.media = media;
    }
    public float getMedia(){
        return media;
    }
    public void setMedia(float media){
        this.media = media;
    }
    public float getTotal(){
        return total;
    }
    public void setTotal(float total){
        this.total = total;
    }
}
