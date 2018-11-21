package bean;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//esse tipo de classe que representa uma entidade é comumente chamada de "bean"
//no lugar de Categoria deve-se criar as classes apresentadas no Banco de dados com seus atributos. 
public class Chefe_de_limpeza {
    private int idChefe;
    private String nome;

    
    private String solicitarProdutosDeLimpeza(Produto produto){
        return nome;
    }
    private String cadastrarProduto(Produto produto){
        return nome;
    }
    
    public int getIdChefe() {
        return idChefe;
    }

    public void setIdChefe(int idChefe) {
        this.idChefe = idChefe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Chefe_de_limpeza(int idChefe, String nome) {
        this.idChefe = idChefe;
        this.nome = nome;
    }

    public Chefe_de_limpeza() {
    }
    
   
    
}