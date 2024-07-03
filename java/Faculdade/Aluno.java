import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private int matricula;
    private List<Curso> cursos;

    public Aluno(String nome, int idade, String cpf, int matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
        if (curso != null && !curso.isEmpty()) {
            // Adiciona o curso apenas se não estiver adicionado ainda
            Curso novoCurso = new Curso(curso, 0, null);
            if (!cursos.contains(novoCurso)) {
                adicionarCurso(novoCurso);
            }
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            try {
                curso.adicionarAluno(this); // Adiciona o aluno ao curso
            } catch (MatriculaInvalidaException e) {
                System.out.println("Erro ao adicionar aluno ao curso: " + e.getMessage());
            }
        }
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
        curso.removerAluno(this);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cursos matriculados:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNome());
        }
    }

    public void realizarMatricula(int matricula, String curso) {
        this.matricula = matricula;
        Curso novoCurso = new Curso(curso, 0, null);
        if (!cursos.contains(novoCurso)) {
            adicionarCurso(novoCurso);
        }
        System.out.println("Você realizou a matrícula no curso de " + curso + ". Seu número de matrícula é " + matricula + ".");
    }
}
