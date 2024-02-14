
package mx.com.biblioteca.persistencia;

import java.sql.SQLException;
import mx.com.biblioteca.logica.Libro;
import java.util.List;
/**
 *
 * @author Raquel Martínez
 */
public class ControladoraPersistencia {
    
    LibroP libroP = new LibroP();
    
    public List<Libro> consultarLibros() throws SQLException {
        // Enviar el tipo resulset a la lógica
        return LibroP.consultarLibros();
    }
    
    public void guardarLibro(Libro libro) throws SQLException {
        libroP.guardar(libro);
    }
}
