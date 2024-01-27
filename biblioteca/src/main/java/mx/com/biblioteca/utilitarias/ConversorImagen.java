
package mx.com.biblioteca.utilitarias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Raquel Martínez
 */
public class ConversorImagen {
    
    public static byte[] convertirImagenABytes(String rutaPortada) throws FileNotFoundException, IOException{
        // Convierte un archivo de tipo imágen en un arreglo de byte para almacenar en BD
        File archivoPortada = new File(rutaPortada);
        FileInputStream fileInputStream = new FileInputStream(archivoPortada);
        byte[] bytesPortada = new byte[(int) archivoPortada.length()];
        fileInputStream.read(bytesPortada);
        return bytesPortada; // Retorna el arreglo de byte
    }
}
