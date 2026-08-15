package AtividadesemJava;
import java.util.Random; 

public class Matriz {
    public static void main(String[] Args){ //Main da classe
        
        int[][] matriz = new int[3][3]; //Cria uma matriz bidimensional de inteiros 3x3
        
        Random gerador = new Random();
        
        for(int i = 0; i < 3; i++){ //laços de for para o prenchimento da matriz
            for(int j = 0; j < 3; j++){
                matriz[i][j] = gerador.nextInt(50) + 1; //Randomização da matriz
            }
        }
        
        for(int i = 0; i < 3; i++){ //Matriz sendo printada
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        int[][] matriz2 = new int[2][5];
        
        //Primeiro preencher a matriz
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 5; j++){
                matriz2[i][j] = gerador.nextInt(50) + 1;

            }
        }

        //Impressao da matriz
        for (int i = 0; i < 2; i ++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz2[i][j] + ", "); //Espaço é utlizado para melhorar a legibilidade da matriz
            }
            System.out.println();//quebra de linha da matriz
        }
        
        //Declaração da variavel maior
        int maior = matriz2[0][0];

        //laço para percorrer dentro da matriz
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 5; j++){

                //comparação dos valores dentro da matriz
                if (matriz2[i][j] > maior){

                    //Se o valor qe esta dentro for maior do que "maior", entao a variavel maior recebe esse valor
                    maior = matriz2[i][j];
                }
            }
        }

        int menor = matriz2[0][0];

        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 5; j++){
                if (matriz2[i][j] < menor){
                    menor = matriz2[i][j]; 
                }
            }
        }
        
        int soma = 0;
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 5; j ++){
                soma = soma + matriz2[i][j];
            }
        }

        float media = (float) soma / 10; 
        //Todos os prints
        System.out.println("O maior numero da matriz é: " + maior);
        
        System.out.println("O menor numero da matriz é: " + menor);
        
        System.out.println("A soma de toos os elementos da matriz é: " + soma);
        
        System.out.println("A media de todos os elementos da matriz é: " + media);
        }
    }