package Exercicios2;

public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho = new Produto[10];

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getVip(){
        return vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    public Produto[] getCarrinho(){
        return carrinho;
    }
    public void setCarrinho(Produto[] carrinho){
        this.carrinho = carrinho;
    }

    public void adicionarProduto(Produto produto){
        for (int i = 0; i < this.carrinho.length; i++){
            if(this.carrinho[i] == null){
                this.carrinho[i] = produto;
                return;
            }
        }
        System.out.println("Carrinho cheio! Nao foi possivel adicionar o produto.");
    }

    public void removerProduto(int posicao){
        if (posicao < 0 || posicao >= this.carrinho.length || this.carrinho[posicao] == null){
            System.out.println("Posicao invalida ou vazia.");
            return;
        }

        for (int i = posicao; i < this.carrinho.length - 1; i++){
            this.carrinho[i] = this.carrinho[i + 1];
        }
        this.carrinho[this.carrinho.length - 1] = null;
    }

    public void comprar(){
        double total = 0;

        for (int i = 0; i < this.carrinho.length; i++){
            if (this.carrinho[i] != null){
                total += this.carrinho[i].getValor();
            }
        }

        if (this.vip){
            total = total * 0.9;
        }

        System.out.println("Total da compra: R$ " + total);

        for (int i = 0; i < this.carrinho.length; i++){
            this.carrinho[i] = null;
        }
    }
}