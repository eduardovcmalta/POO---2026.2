package ExercicioemSala;

public class Estudante_Monitor extends Estudante {
    // Usei String para o horario (ex: "14:00 - 16:00"), pois e mais flexivel
    // para representar um intervalo de horario do que um tipo numerico.
    private String horario;

    public Estudante_Monitor(String nome, int idade, double mensalidade, String horario) {
        super(nome, idade, mensalidade);
        this.horario = horario;
    }

    public void imprimirHorario() {
        System.out.println("O horario de monitoria de " + nome + " e: " + horario);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}