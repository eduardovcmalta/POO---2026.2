package Exercicios;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;
    
    public Professor(String nome, int idade, int matricula, Sala sala){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public String iniciar_Aula(){
        if (!sala.isOcupacao()){
            return "A sala de aula esta ocupada e nao pode iniciar a aula";
        }else{
            sala.alternar();
            return "A aula começou";
        }    
    }

    public void chamada(boolean[] presenca){
        for (int i = 0; i < sala.getTurma().length; i ++){
            boolean[] aux = sala.getTurma()[i].getPresenca();
            aux[sala.getDia()] = presenca[i];
            sala.getTurma()[i].setPresenca(aux);
        }
    }
    public String terminarAula(){
        if(sala.isOcupacao()){
            sala.alternar();
            sala.setDia(sala.getDia() + 1);
            return "A aula do dia" + sala.getDia() + "foi finalizada com sucesso";
        }else{
            return "A aula nao esta sediando nenhuma aula";
        }
    }

}
