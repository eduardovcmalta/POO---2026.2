package Aula110;

public class Main {
    public static void main(String[] Args){
        Aluno a1 = new Aluno("Joao", "023403824928");

        try{
             a1.media(2.0, 20.0);
        }catch(NotaInvalidaException excecao){
            System.out.println(excecao.getMessage());
        }finally{
            System.out.println("Operacao finalizada!");
        }

        System.out.println(a1.getNota());
    }
}
