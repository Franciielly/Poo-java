public class Estagiario extends Funcionario {
    private String supervisor;

    public Estagiario (String nome, String cpf, double salario, String supervisor) {
        super (nome,cpf,salario); 
        this.supervisor=supervisor;
    }
    public Estagiario () {

    }
    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    public void ExibirDetalhes () {
        System.out.println("Supervisor: " + supervisor);
    }
    public void exibirDetalhes() {
        System.out.println("Nome:" + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Supervisor: " + supervisor);
    }
}

