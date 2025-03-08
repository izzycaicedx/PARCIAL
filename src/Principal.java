
public class Principal {
    
    protected String titulo;  protected String autor;
    protected int numEjem;
    protected int numEjemPrestados;

    public Principal(String titulo, String autor, int numEjem, String autor, int numEjemPrestados) {
        this.titulo = titulo;
        this.numEjem = numEjem;
        this.autor = autor;
        this.numEjemPrestados = numEjemPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    public void setNumEjem(int numEjem) {
        this.numEjem = numEjem;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumEjemPrestados(int numEjemPrestados) {
        this.numEjemPrestados = numEjemPrestados;
    }
    
    
    
    
    
    
   
    
}
