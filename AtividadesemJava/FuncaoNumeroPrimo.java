package AtividadesemJava;
import java.util.Scanner;

public class FuncaoNumeroPrimo {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu número: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero <= 1){
            primo = false;
        }else{
            for ( int i = 2; i <= numero / 2; i++){
                if (numero % i == 0){
                    primo = false;
                    break;
                }
            }
        }
        if (primo){
            System.out.println("Verdadeiro, o numero e primo.");
        }else{
            System.out.println("Falso, o numero nao e primo");
        }

        sc.close();
    }
}
