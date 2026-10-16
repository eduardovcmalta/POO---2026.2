package simulado;

import java.util.ArrayList;

public class TorreElite extends Torre {
    private double danoCritico;

    public TorreElite(int codigo, String nome, double danoBase,
                      ArrayList<Inimigo> inimigosAlcancados, boolean ativa,
                      double danoCritico) {
        super(codigo, nome, danoBase, inimigosAlcancados, ativa);
        this.danoCritico = danoCritico;
    }

    public double getDanoCritico() {
        return danoCritico;
    }

    public void setDanoCritico(double danoCritico) {
        this.danoCritico = danoCritico;
    }

    @Override
    public int atacar() {
        int eliminados = 0;

        for (Inimigo inimigo : getInimigosAlcancados()) {
            if (inimigo.getSituacao().equals("Eliminado")) {
                continue; // já eliminado, não sofre alteração
            }

            if (inimigo.getSituacao().equals("Resistente")) {
                inimigo.setVida(inimigo.getVida() - getDanoBase());
            } else { // "Ferido"
                inimigo.setVida(inimigo.getVida() - danoCritico);
            }

            if (inimigo.getVida() > 50) {
                inimigo.setSituacao("Resistente");
            } else if (inimigo.getVida() > 0) {
                inimigo.setSituacao("Ferido");
            } else {
                inimigo.setSituacao("Eliminado");
                eliminados++;
            }
        }

        return eliminados;
    }

    public int atacar(ArrayList<Boolean> buffs) {
        int eliminados = 0;
        ArrayList<Inimigo> inimigos = getInimigosAlcancados();

        for (int i = 0; i < inimigos.size(); i++) {
            Inimigo inimigo = inimigos.get(i);

            if (inimigo.getSituacao().equals("Eliminado")) {
                continue; // já eliminado, não sofre alteração
            }

            double dano;
            if (inimigo.getSituacao().equals("Resistente")) {
                dano = getDanoBase();
            } else { // "Ferido"
                dano = danoCritico;
            }

            if (buffs.get(i)) {
                dano += 10; // buff aumenta o dano em 10
            }

            inimigo.setVida(inimigo.getVida() - dano);

            if (inimigo.getVida() > 50) {
                inimigo.setSituacao("Resistente");
            } else if (inimigo.getVida() > 0) {
                inimigo.setSituacao("Ferido");
            } else {
                inimigo.setSituacao("Eliminado");
                eliminados++;
            }
        }

        return eliminados;
    }   
}