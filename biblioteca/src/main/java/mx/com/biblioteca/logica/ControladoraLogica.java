/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.biblioteca.logica;

import java.io.IOException;
import mx.com.biblioteca.utilitarias.ConversorImagen;

/**
 *
 * @author Raquel Martínez
 */
public class ControladoraLogica {

    public void guardarLibro(String titulo, String autor, String editorial, 
            String rutaPortada, String ejemplaresDisponibles) throws IOException {
        
        // Convierte los datos recibidos a los datos necesarios para la BD
        int ejemplaresDiso = Integer.parseInt(ejemplaresDisponibles);
        byte[] portada = ConversorImagen.convertirImagenABytes(rutaPortada); 
        
    }
    
}
