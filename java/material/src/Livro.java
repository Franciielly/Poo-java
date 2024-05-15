public class Livro extends Material {
    private int numerosPaginas;

    public Livro (){
    }

    public Livro (int numerosPaginas) {
        this.numerosPaginas = numerosPaginas;
    }

    public Livro (String titulo, String autor, int anoPublicacao, int numerosPaginas) {
        super (titulo, autor, anoPublicacao);
        this.numerosPaginas = numerosPaginas;
    }
    public int getNumerosPaginas() {
        return numerosPaginas;
    }

    public void setNumerosPaginas(int numerosPaginas) {
        this.numerosPaginas = numerosPaginas;
    }
    
    public void exibirDetalhes (){
        System.out.println("Titulo: " + super.getTitulo());  
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Ano de publicação: " + super.getAnoPublicacao());
        System.out.println("Número de páginas: " + this.getNumerosPaginas());
    }

}


