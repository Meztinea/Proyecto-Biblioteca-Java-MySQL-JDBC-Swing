
package mx.com.biblioteca.logica;

/**
 *
 * @author Raquel Martínez
 */
public class Material {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private byte[] portada;
    private int ejemplaresDisponibles;
    
    public Material(){
        
    }
    
    public Material(int id, String titulo, String autor, String editorial, 
            byte[] portada, int ejemplaresDisponibles){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.portada = portada;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
    
    public Material(String titulo, String autor, String editorial, 
            byte[] portada, int ejemplaresDisponibles){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.portada = portada;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public String getEditorial() {
        return this.editorial;
    }
    
    public void setPortada(byte[] portada) {
        this.portada = portada;
    }
    
    public byte[] getPortada() {
        return this.portada;
    }
    
    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
    
    public int getEjemplaresDisponibles() {
        return this.ejemplaresDisponibles;
    }
    
}
