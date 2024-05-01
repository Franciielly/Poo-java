public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    
    public Pessoa (String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        }
        public Pessoa () {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void fazerAniversario () {
        this.idade += 1;
    }
    public void exibirInformacoes () {
        System.out.println("-----Informações--------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("-------------------------");
    }
}
