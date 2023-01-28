public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String isbn;
    private boolean prestado;

    public Libro() {
    }
    public Libro(String titulo, String autor, int paginas, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
        this.prestado = prestado;
    }
    public String getTitulo() {
        return titulo;
    }
    protected boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPaginas() {
        return paginas;
    }
}
