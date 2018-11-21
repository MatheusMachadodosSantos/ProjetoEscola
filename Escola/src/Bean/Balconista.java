package bean;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//esse tipo de classe que representa uma entidade é comumente chamada de "bean"
//no lugar de Categoria deve-se criar as classes apresentadas no Banco de dados com seus atributos. 
public class Balconista {
    private int idBalconista;
    private String nome;

    public void cadastrarLivro(){
    }
    
    public int getIdBalconista() {
        return idBalconista;
    }

    public void setIdBalconista(int idBalconista) {
        this.idBalconista = idBalconista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Balconista(int idBalconista, String nome) {
        this.idBalconista = idBalconista;
        this.nome = nome;
    }

    public Balconista() {
    }
 
    
}
    