public class Gerente extends Funcionario {
    private double bonus;


    public Gerente (String nome, String cpf, double salario, double bonus) {
        super (nome,cpf,salario);
        this.bonus = bonus;
    }

    public Gerente () {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void exibirDetalhes() {
        System.out.println("Nome:" + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Bonus: " + bonus);
    }

}

