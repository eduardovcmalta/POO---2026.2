package AtividadesemJava;
import java.util.Random;

public class Funcaovetor {
    public static void main(String[] args){
        
        int[] vetor = new int[5];

        Random gerador = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i]= gerador.nextInt( 50) + 1;

        }
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
            if (i < vetor.length - 1){
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
        
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }

        System.out.println("O menor valor do vetor é: " + menor);
    }
}
