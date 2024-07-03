public class Professor extends Pessoa {
    private double salario;
    private String disciplina;
    private int quantidadeAulaDada;

    public Professor(String nome, int idade, String cpf, double salario, String disciplina) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
        this.quantidadeAulaDada = 0; 
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário deve ser um valor positivo.");
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.isEmpty()) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Disciplina não pode ser nula ou vazia.");
        }
    }

    public int getQuantidadeAulaDada() {
        return quantidadeAulaDada;
    }

    public void exibirDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Quantidade de Aulas Dadas: " + this.getQuantidadeAulaDada());
    }

    public void darAula(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeAulaDada += quantidade;
            System.out.println("Você deu " + quantidade + " aula(s) de " + disciplina + ". Total de aulas dadas: " + this.quantidadeAulaDada);
        } else {
            System.out.println("Quantidade de aulas deve ser um valor positivo.");
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + super.getNome() + '\'' +
                ", idade=" + super.getIdade() +
                ", cpf='" + super.getCpf() + '\'' +
                ", salario=" + salario +
                ", disciplina='" + disciplina + '\'' +
                ", quantidadeAulaDada=" + quantidadeAulaDada +
                '}';
    }
}
