public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor (String nome, String cpf, double salario, String linguagemPrincipal) {
        super (nome, cpf,salario); 
        this.linguagemPrincipal = linguagemPrincipal;
    }
    public Desenvolvedor () {

    }
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public void exibirDetalhes() {
        System.out.println("Nome:" + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
    }
}
