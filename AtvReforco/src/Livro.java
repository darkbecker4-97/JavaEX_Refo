public class Livro {
    public String titulo;
    public String autor;
    public String editora;
    public int numeroPaginas;

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
