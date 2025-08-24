public class Livro {
    //Livro poderia ser um record tambem
    private String titulo;
    private String autor;
    private Editora editora;

    // Construtor

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    //toString para implimir na tela os nomes
    @Override
    public String toString() {
        return "Livro[titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + "]";
    }

}
