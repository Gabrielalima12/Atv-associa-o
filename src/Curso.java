public class Curso {

    private String nome;
    private int periodo;
    private Universidade universidade;
    private Turma turma;
    private Professor professor;

    public Curso() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
