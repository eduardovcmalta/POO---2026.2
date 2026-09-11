package Aula55;

public class Conta {
    private String agencia;
    private String conta;
    private float saldo;

    public Conta(String agencia, String conta, float saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getAgencia(){
        return agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getConta(){
        return conta;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void saque(float valor){
        if(getSaldo() < valor && valor > 0){
            System.out.println("Saldo insuficiente!");
        }else{
            float saldoAtual = getSaldo() - valor;
            setSaldo(saldoAtual);
        }
    }
    public void deposito(float valor){
       if(valor < 0){
        System.out.println("Tu é burro? vai depositar valor negativo e? ");
       }else{
            float saldoAtual = getSaldo() + valor;
            setSaldo(saldoAtual);
        }
    }

}

