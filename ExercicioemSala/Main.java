package ExercicioemSala;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Joao", 20, 450.00);
        estudante.exibirMensalidade();

        System.out.println("-----------------------------");

        Estudante_Monitor monitor = new Estudante_Monitor("Maria", 22, 300.00, "14:00 - 16:00");
        monitor.exibirMensalidade(); // metodo herdado de Estudante
        monitor.imprimirHorario();    // metodo proprio do Monitor
    }
}