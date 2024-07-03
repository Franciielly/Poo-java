import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private String professorResponsavel;
    private List<Aluno> alunos;

    public Curso(String nome, int codigo, String professorResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorResponsavel = professorResponsavel;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode ser nulo ou vazio.");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("Código deve ser um valor positivo.");
        }
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        if (professorResponsavel != null && !professorResponsavel.isEmpty()) {
            this.professorResponsavel = professorResponsavel;
        } else {
            System.out.println("Professor responsável não pode ser nulo ou vazio.");
        }
    }

    public void adicionarAluno(Aluno aluno) throws MatriculaInvalidaException {
        if (alunos.size() >= 5) {
            throw new MatriculaInvalidaException("O aluno " + aluno.getNome() + " já está matriculado em 5 cursos.");
        }
        alunos.add(aluno);
        aluno.adicionarCurso(this);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        aluno.removerCurso(this);
    }

    public void listarAlunos() {
        System.out.println("Alunos matriculados no curso " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

    public void exibirDetalhesCurso() {
        System.out.println("Curso: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Professor Responsável: " + this.getProfessorResponsavel());
        listarAlunos();
    }
}
