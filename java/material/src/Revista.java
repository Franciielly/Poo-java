public class Revista extends Material {
    private int edicao;
    private String mesPublicacao;

    public Revista () {
    }
    public Revista (int edicao,String mesPublicacao) {
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }
    public Revista (String titulo, String autor, int anoPublicacao, int edicao, String mesPublicacao) {
        super (titulo, autor, anoPublicacao);
        this.edicao=edicao;
        this.mesPublicacao = mesPublicacao; 
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public String getMesPublicacao() {
        return mesPublicacao;
    }
    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    public void exibirdetalhes () {
        System.out.println("Titulo: " + super.getTitulo());  
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Ano de publicação: " + super.getAnoPublicacao());
        System.out.println("Edição: " + this.getEdicao());
        System.out.println("Mes de publicação: " + this.getMesPublicacao());
    }

}
