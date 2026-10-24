package Aula110;

public class NotaInvalidaException extends Exception {
    public NotaInvalidaException(){
        super("Nota inserida invalida, operação abortada!");
    }

    public NotaInvalidaException(double nota1, double nota2){
        String notasInvalidas = "";
        
        if(nota1 > 10 || nota1 < 0){
            notasInvalidas += nota1 + " ";
        }
        if(nota2 > 10 || nota2 < 0){
            notasInvalidas += nota2 + " ";
        }
        super("notasInvalidas: " + notasInvalidas);
    }
}
