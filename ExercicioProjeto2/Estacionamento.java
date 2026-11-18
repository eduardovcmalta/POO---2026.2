package ExercicioProjeto2;

public class Estacionamento {
    private static final int FILEIRAS = 3;
    private static final int VAGAS = 5;
    private boolean [][] mapa;

    public Estacionamento(){
        mapa = new boolean[FILEIRAS][VAGAS];
    }

    private int[] localizar(String codigo){
        if(codigo == null || codigo.length() != 2){
            return null;
        }
        codigo = codigo.toUpperCase();

        int fileira = codigo.charAt(0) - 'A';

        int vaga = Character.getNumericValue(codigo.charAt(1)) - 1;

        if (fileira < 0 || fileira >= FILEIRAS || vaga < 0 || vaga >= VAGAS) {
            return null;
        }
        return new int[] {fileira, vaga};
    }

    public boolean ocupar(String codigo){
        int[] pos = localizar(codigo);
        if(pos == null || mapa[pos[0]][pos[1]]){
            return false;
        }
        mapa[pos[0]][pos[1]] = true;
        return true;
    }
    public boolean liberar(String codigo){
        int[] pos = localizar(codigo);
        if(pos == null || !mapa[pos[0]][pos[1]]){
            return false;
        }
        mapa[pos[0]][pos[1]] = false;
        return true;
    }
    
    public boolean isLivre(String codigo){
        int[] pos = localizar(codigo);
        return pos != null && !mapa[pos[0]][pos[1]];
    }

    public void exibirMapa(){
        System.out.println(" 1 2 3 4 5");
        for(int i = 0; i < FILEIRAS; i++){
            System.out.print((char) ('A' + i) + " ");
            for(int j = 0; j < VAGAS; j++){
                System.out.print((mapa[i][j] ? "X" : ".") + " ");
            }
            System.out.println();
        }
    }
}
