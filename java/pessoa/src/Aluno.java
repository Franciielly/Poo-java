public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno () {

    }

    public Aluno (int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }
    public Aluno (String nome, int idade, int altura, int matricula, String curso) {
        super (nome,idade,altura);
        this.matricula = matricula;
        this.curso = curso;
    }
     
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void exibirInformacoes () {
        System.out.println("--------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Altura: " + super.getAltura());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("-----------------------------");

    }
}
