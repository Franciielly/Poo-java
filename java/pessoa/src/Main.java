public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Francielly");
        p1.setIdade(18);
        p1.setAltura(1.67);

        p1.exibirInformacoes();
        System.out.println();

        p1.fazerAniversario();

        p1.exibirInformacoes();

        Aluno a1 = new Aluno();
        a1.setNome("Maitê");
        a1.setIdade(19);
        a1.setAltura(1.71);
        a1.setMatricula(201879);
        a1.setCurso("CC");

        System.out.println();
        a1.fazerAniversario();

        a1.exibirInformacoes();
    }
}
