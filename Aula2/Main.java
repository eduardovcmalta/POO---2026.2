package Aula2;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("joao", 17, 50.35, "masculino");
        Pessoa p2 = new Pessoa("Maria", 22, 50.3, "feminino");
        /*System.out.println(p1);
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.peso);*/

        /*p1.apresentacao();
        p2.apresentacao();*/

        p1.conhecer(p2);
        p2.conhecer(p1);

    }
}
