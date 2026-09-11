package Aula30;
public enum Ticket {
    NORMAL(1.0, "codigo promocional"),
    MEIA_ENTRADA(0.5, "sem codigo promocional"),
    VIP(0.1, "codigo promocional");

    double desconto;
    String codigo;

    Ticket(double d, String codigo) {
        this.desconto = d;
        this.codigo = codigo;
    }

    public double getDesconto(){
        return desconto;
    }

    public String getCodigo(){
        return codigo;
    }
}
