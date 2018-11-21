
import java.util.Date;



/**
 *
 * @author Camila <Camila.Serrao>
 */

//esse tipo de classe que representa uma entidade é comumente chamada de "bean"
//no lugar de Categoria deve-se criar as classes apresentadas no Banco de dados com seus atributos. 
public class Discente{
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private Date DataNasc;
    
    public String alterarDadosPessoais(String email, String endereco, String telefone, Date dataNasc){
        return email;  
    }
    public void solicitarLivro(){
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public Discente(int id, String nome, String email, String telefone, Date DataNasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.DataNasc = DataNasc;
    }

    public Discente() {
    }
}