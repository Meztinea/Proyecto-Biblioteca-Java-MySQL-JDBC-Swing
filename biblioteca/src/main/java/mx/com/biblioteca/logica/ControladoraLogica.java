
package mx.com.biblioteca.logica;

import java.io.IOException;
import mx.com.biblioteca.persistencia.ControladoraPersistencia;
import mx.com.biblioteca.utilitarias.ConversorImagen;

/**
 *
 * @author Raquel Martínez
 */
public class ControladoraLogica {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void guardarLibro(String titulo, String autor, String editorial, 
            String rutaPortada, String ejemplaresDisponibles) throws IOException {
        
        // Convierte los datos recibidos a los datos necesarios para la BD
        int ejemplares = Integer.parseInt(ejemplaresDisponibles);
        byte[] portada = ConversorImagen.convertirImagenABytes(rutaPortada); 
        
        // Crea un objeto de tipo Libro 
        Libro libro = new Libro(titulo, autor, editorial, portada, ejemplares);
        
        // Envía el objeto a la capa de persistencia - Con el tipo de dato correcto
        controladoraPersistencia.guardarLibro(libro);
    }
}
