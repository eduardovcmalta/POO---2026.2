package GQ1;

public class TurmaFinal extends Turma {
    private double mediafinal;

    public TurmaFinal(int codigo, String entrada, double mediafinal) {
        super(codigo, entrada);
        this.mediafinal = mediafinal;
    }

    public double GetMediaFinal() { return mediafinal; }
    public void SetMediaFinal(double mediafinal) { this.mediafinal = mediafinal; }

    @Override
    public int resultados() {
        int qtdAprovadosPosFinal = 0;
        for (Prova p : getProvas()) {
            if (p == null) {
                continue;
            }
            if ("Final".equals(p.GetSituacao())) {
                if (p.GetNota() > mediafinal) {
                    p.SetSituacao("Aprovado pos final");
                    qtdAprovadosPosFinal++;
                } else {
                    p.SetSituacao("Reprovado");
                }
            }
        }
        return qtdAprovadosPosFinal;
    }
}