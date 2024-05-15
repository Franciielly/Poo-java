public class Biblioteca {
    public static void main(String[] args) throws Exception {

       Livro meuLivro = new Livro ();
       Revista minhaRevista = new Revista (); 

        
        meuLivro.setTitulo("Como programar em java?");
        meuLivro.setAutor("Francielly Oliveira");
        meuLivro.setAnoPublicacao(2024);
        meuLivro.setNumerosPaginas (654);
        meuLivro.exibirDetalhes();

        System.out.println();

        
        minhaRevista.setTitulo("Programação orientada a objetos");
        minhaRevista.setAutor("Luan");
        minhaRevista.setAnoPublicacao(2005);
        minhaRevista.setEdicao(14);
        minhaRevista.setMesPublicacao("Junho");
        minhaRevista.exibirDetalhes();



    }


}
