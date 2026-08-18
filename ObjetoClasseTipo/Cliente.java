package ObjetoClasseTipo;

public class Cliente{
    private String nome;
    private Ticket entrada;
    private double valor;

    //construtor
    public Cliente(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    //gets e sets
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return this.valor;
    }

   public void setValor(double Valor){
        this.valor = Valor;
   }
   public void setEntrada(Ticket entrada){
        this.entrada = entrada;
   }
   public Ticket getEntrada(){
        return this.entrada;
   }
    public void calculo(){
        if(entrada != null) {
            System.out.println("desconto anunciado: " + entrada.desconto);

            double novoValor = entrada.desconto * valor;

            System.out.println("O valor do ticket é: R$" + valor + ", e o tipo de ticket é: " + entrada);

        }else{
            System.out.println("Ticket nao inserido");
        }
    }
}

