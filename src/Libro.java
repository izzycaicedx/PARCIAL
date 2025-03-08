
public class Libro {
        protected String titulo;  protected String autor;
    protected int numEjem;
    protected int numEjemPrestados;

    public Libro(String titulo, String autor, int numEjem, int numEjemPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjem = numEjem;
        this.numEjemPrestados = numEjemPrestados;
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

    
     public String getTitulo() {
        return titulo;
    }

    public int getNumEjem() {
        return numEjem;
    }

    public int getNumEjemPrestados() {
        return numEjemPrestados;
    }

    public String getAutor() {
        return autor;
    }

    
    public void setNumEjemPrestados(int numEjemPrestados) {
        this.numEjemPrestados = numEjemPrestados;
    }
    
    public boolean Disponible (){
     
        if (numEjem > numEjemPrestados){
            
             numEjemPrestados++;
             return true;
                     
            }  
    
        else 
             return false; 
        
            }

    
       public boolean Devolucion(){
        
       if (numEjemPrestados > 0 ){
           numEjemPrestados--;
       return true;
       
       } 
       return false;
       
       }
 
public String toString (){
    return "Titulo: " + titulo + "Autor: " + autor + "Numeros Ejemplares: " + numEjem + "Numeros ejemplares pretados: " +numEjemPrestados;
            
            }
            


}





         



               
       
  