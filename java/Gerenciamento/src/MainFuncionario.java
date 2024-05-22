import java.util.ArrayList;

public class MainFuncionario {
    public static void main(String[] args) throws Exception {
        ArrayList<Gerente> listaGerentes = new ArrayList<Gerente>() {{
            add(new Gerente("Fernando", "1245148654", 15154, 15424));
        }};

        ArrayList<Desenvolvedor> listaDesenvolvedores = new ArrayList<Desenvolvedor>() {{
            add(new Desenvolvedor("Fernando", "1245148654", 15154, "PHP"));
        }};

        ArrayList<Estagiario> listaEstagiarios = new ArrayList<Estagiario>() {{
            add(new Estagiario("Fernando", "1245148654", 154544, "Vanderlei"));
        }};

        for (Gerente item : listaGerentes) {
            item.exibirDetalhes();
            System.out.println();
        }

        for (Desenvolvedor item : listaDesenvolvedores) {
            item.exibirDetalhes();
            System.out.println();
        }

        for (Estagiario item : listaEstagiarios) {
            item.exibirDetalhes();
            System.out.println();
        }
    }
}

