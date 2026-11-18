package ExercicioProjeto2;

public class MainEstacionamento {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();

        System.out.println("ocupar A2: " + e.ocupar("A2"));   // true
        System.out.println("ocupar A2 de novo: " + e.ocupar("A2")); // false
        System.out.println("ocupar C5: " + e.ocupar("C5"));   // true
        System.out.println("ocupar Z9: " + e.ocupar("Z9"));   // false (inválido)
        System.out.println("A2 livre? " + e.isLivre("A2"));   // false
        System.out.println("B3 livre? " + e.isLivre("B3"));   // true
        e.exibirMapa();

        System.out.println("liberar A2: " + e.liberar("A2")); // true
        System.out.println("liberar A2 de novo: " + e.liberar("A2")); // false
        e.exibirMapa();
    }
}