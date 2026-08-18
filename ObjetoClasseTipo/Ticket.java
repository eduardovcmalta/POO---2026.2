package ObjetoClasseTipo;

public enum Ticket {
    NORMAL(1.0, "sem desconto aplicado"),
    MEIA_ENTRADA(0.5, "desconto aplicado"),
    VIP(0.9, "desconto aplicado");

    Ticket (double d, String teste){
        this.desconto = d;
        this.teste = teste;
    }
    double desconto;
    String teste;
}