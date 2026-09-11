package Aula65;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomcliente;
    private Item[] carrinho = new Item[100];

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public boolean isBomCliente(){
        return bomcliente;
    }
    public void setBomCliente(boolean bomcliente){
        this.bomcliente = bomcliente;
    }

    public Item[] getCarrinho(){
        return carrinho;
    }
    public void setCarrinho(Item[] carrinho){
        this.carrinho = carrinho;
    }

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomcliente, Item[] carrinho){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomcliente = bomcliente;
        this.carrinho = carrinho;

    }
    
    public void adicionar(Item item){
        for(int i = 0; i < carrinho.length; i++){
            if(carrinho[i] == null){
                carrinho[i] = item;
            break;
            }

        }
    }

    public void cancelar(int codigo){
        for (int i = 0;  i < carrinho.length; i++){
            if(carrinho[i] != null && carrinho[i].getCodigo() == codigo){
                carrinho[i] = null;
                break;
            }
        }
    }
    public ResumoCompra comprar(){
        float total = 0;
        int quantidade = 0;
        for(int i = 0; i< carrinho.length; i++){
            if(carrinho[i] != null){
                total += carrinho[i].getValor();
                quantidade++;
                carrinho[i].setQuantidadeEmEstoque(carrinho[i].getQuantidadeEmEstoque() - 1);
            }
        }
        float media = quantidade > 0 ? total / quantidade : 0;
        return new ResumoCompra(total, media);
    }
}
