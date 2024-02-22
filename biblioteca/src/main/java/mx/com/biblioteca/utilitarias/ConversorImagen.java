
package mx.com.biblioteca.utilitarias;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
    
    public static ImageIcon convertirBytesAImagen(byte[] bytesPortada) throws IOException {
        
        // Crea un InputStream lector de bytes para el arreglo
        ByteArrayInputStream streamBytes = new ByteArrayInputStream(bytesPortada);
        
        // Crea una imagen con el stream de bytes
        Image imagen = ImageIO.read(streamBytes);
        
        // Convierte a objeto ImageIcon - Necesario para insertar en un JLabel
        ImageIcon imagenIcono = new ImageIcon(imagen);
        
        return imagenIcono;
    }
}
