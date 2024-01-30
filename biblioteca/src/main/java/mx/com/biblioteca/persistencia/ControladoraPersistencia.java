
package mx.com.biblioteca.persistencia;

import java.sql.SQLException;
import mx.com.biblioteca.logica.Libro;

/**
 *
 * @author Raquel Martínez
 */
public class ControladoraPersistencia {
    
    LibroP libroP = new LibroP();
    
    public void guardarLibro(Libro libro) throws SQLException {
        libroP.guardar(libro);
    }
}
