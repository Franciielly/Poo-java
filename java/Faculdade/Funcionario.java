public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private String tarefaExecutada;

    public Funcionario(String nome, int idade, String cpf, String cargo, String setor) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.setor = setor;
        this.tarefaExecutada = "";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("Cargo não pode ser nulo ou vazio.");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor != null && !setor.isEmpty()) {
            this.setor = setor;
        } else {
            System.out.println("Setor não pode ser nulo ou vazio.");
        }
    }

    public String getTarefaExecutada() {
        return tarefaExecutada;
    }

    public void exibirDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Tarefa Executada: " + this.getTarefaExecutada());
    }

    public void executarTarefa(String tarefa) {
        if (tarefa != null && !tarefa.isEmpty()) {
            this.tarefaExecutada = tarefa;
            System.out.println("Executar tarefa: " + tarefa);
        } else {
            System.out.println("Tarefa não pode ser nula ou vazia.");
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.getNome() + '\'' +
                ", idade=" + super.getIdade() +
                ", cpf='" + super.getCpf() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", setor='" + setor + '\'' +
                ", tarefaExecutada='" + tarefaExecutada + '\'' +
                '}';
    }
}
