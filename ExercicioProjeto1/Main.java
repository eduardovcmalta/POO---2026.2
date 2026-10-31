package ExercicioProjeto1;

public class Main {
    public static void main(String[] Args){
        Livro livro1 = new Livro;
        Livro livro2 = new Livro;

        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setPaginas(265);
        livro1.setPreco(39.90);

        livro2.setTitulo("Casa do Caralho: A revolta da chiabata 2");
        livro2.setAutor("LelecoVCMalta");
        livro2.setPaginas(390);
        livro2.setPreco(300.00);

        livro1.exibirFicha();
        livro2.exibirFicha();

        livro1.setPaginas(-5);

        livro1.exibirFicha();
    }
}
