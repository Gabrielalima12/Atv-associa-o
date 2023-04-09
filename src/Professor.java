public class Professor {
    
    private String nome;
    private int ra;
    private Universidade universidade;
    private Curso curso;

    public professor(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
