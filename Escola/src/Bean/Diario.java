package bean;

/**
 *
 * @author Usuario
 */
public class Diario {
    private int idDiario;
    private boolean presença;
    private String Disciplina;
    private double nota;
    
    
    public void registrarFrequencia(){
    }
    public void registrarNota(){
    }
    public void registrarTurma(){
    }
    public void registrarDisciplina(){
    }

    public int getIdDiario() {
        return idDiario;
    }

    public void setIdDiario(int idDiario) {
        this.idDiario = idDiario;
    }

    public boolean isPresença() {
        return presença;
    }

    public void setPresença(boolean presença) {
        this.presença = presença;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Diario(int idDiario, boolean presença, String Disciplina, double nota) {
        this.idDiario = idDiario;
        this.presença = presença;
        this.Disciplina = Disciplina;
        this.nota = nota;
    }

    public Diario() {
    }
    
    
}