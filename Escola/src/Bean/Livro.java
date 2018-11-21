package bean;

/**
 *
 * @author Usuario
 */
public class Livro {
    
private String titulo;
private String editora;
private int ISBN;
int qnt;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Livro(String titulo, String editora, int ISBN, int qnt) {
        this.titulo = titulo;
        this.editora = editora;
        this.ISBN = ISBN;
        this.qnt = qnt;
    }

    public Livro() {
    }

    
}