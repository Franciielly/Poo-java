import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando alunos
        Aluno aluno1 = new Aluno("João", 20, "123.456.789-00", 1001, "Engenharia");
        Aluno aluno2 = new Aluno("Maria", 21, "987.654.321-00", 1002, "Direito");
        Aluno aluno3 = new Aluno("Pedro", 22, "456.789.123-00", 1003, "Medicina");

        // Criando professores
        Professor professor1 = new Professor("Carlos", 35, "111.222.333-44", 5000.00, "Matemática");
        Professor professor2 = new Professor("Ana", 40, "555.666.777-88", 6000.00, "História");

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario("Lucas", 25, "999.888.777-66", "Secretário", "Administrativo");
        Funcionario funcionario2 = new Funcionario("Mariana", 30, "333.222.111-00", "Zelador", "Limpeza");

        // Criando cursos
        Curso curso1 = new Curso("Engenharia Civil", 1, "Prof. Maria");
        Curso curso2 = new Curso("Administração", 2, "Prof. João");

        // Matriculando alunos nos cursos
        try {
            curso1.adicionarAluno(aluno1);
            curso1.adicionarAluno(aluno2);
            curso1.adicionarAluno(aluno3);
            curso2.adicionarAluno(aluno1);
            curso2.adicionarAluno(aluno2);
        } catch (MatriculaInvalidaException e) {
            System.out.println("Erro ao matricular aluno: " + e.getMessage());
        }

        // Realizando ações com professores e funcionários
        professor1.darAula(2);
        professor2.darAula(3);
        funcionario1.executarTarefa("Atender telefonemas");
        funcionario2.executarTarefa("Limpar escritórios");

        // Exibindo dados utilizando polimorfismo
        System.out.println("\nDados das Pessoas:");
        Pessoa[] pessoas = { aluno1, aluno2, aluno3, professor1, professor2, funcionario1, funcionario2 };
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
            System.out.println();
        }

        // Listando alunos por curso
        System.out.println("\nAlunos por Curso:");
        curso1.listarAlunos();
        System.out.println();
        curso2.listarAlunos();

        scanner.close();
    }
}
