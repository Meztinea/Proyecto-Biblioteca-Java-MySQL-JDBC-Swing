
package mx.com.biblioteca.logica;

/**
 *
 * @author Raquel Martínez
 */
public class Libro extends Material {
    
    public Libro() {
        super();
    }
    
    public Libro(int id, String titulo, String autor, String editorial, 
            byte[] portada, int ejemplaresDisponibles){
        super(id, titulo, autor, editorial, portada, ejemplaresDisponibles);
    }
    
    public Libro(String titulo, String autor, String editorial, 
            byte[] portada, int ejemplaresDisponibles) {
        super(titulo, autor, editorial, portada, ejemplaresDisponibles);
    }
}
