
package mx.com.biblioteca.persistencia;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mx.com.biblioteca.logica.Libro;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Raquel Martínez
 */
public class LibroP {

    public static List<Libro> consultarLibros() throws SQLException {
        Connection conexionBD = new ConexionBD().crearConexion();
        
        String sql = "SELECT id, titulo, autor, editorial, ejemplaresDisponibles FROM libros";
        PreparedStatement pstmt = conexionBD.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        
        List<Libro> libros = new ArrayList<>();
        
        while (rs.next()) {
            Libro libro = new Libro();
            
            libro.setId(rs.getInt("id"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setAutor(rs.getString("autor"));
            libro.setEditorial(rs.getString("editorial"));
            libro.setEjemplaresDisponibles(rs.getInt("ejemplaresDisponibles"));
            
            libros.add(libro);
        }
        
        pstmt.close();
        conexionBD.close();
        return libros;
    }
    
    public void guardar(Libro libro) throws SQLException{
        Connection conexionBD = new ConexionBD().crearConexion();
        
        String sql = "INSERT INTO libros (titulo, autor, editorial, "
                + "portada, ejemplaresDisponibles) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement pstmt = conexionBD.prepareStatement(sql);
        pstmt.setString(1, libro.getTitulo());
        pstmt.setString(2, libro.getAutor());
        pstmt.setString(3, libro.getEditorial());
        pstmt.setBytes(4, libro.getPortada());
        pstmt.setInt(5, libro.getEjemplaresDisponibles());
  
        pstmt.execute();
        pstmt.close();
        conexionBD.close();
    }
    
    public static byte[] consultarPortadaLibro(int id) throws SQLException {
        byte[] portada = {};
        
        Connection conexionBD = new ConexionBD().crearConexion();
        
        // Consulta en la base de datos la info de la portada
        String sql = "SELECT portada FROM libros WHERE id = ?";
        PreparedStatement pstmt = conexionBD.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        
        // Convierte el resultado en un arreglo de tipo byte
        if (rs.next()) {
            Blob blob = rs.getBlob("portada");
            
            if (blob != null) {
                portada = blob.getBytes(1, (int) blob.length());
                // Aquí puedes procesar o imprimir los bytes según tus necesidades
                System.out.println(Arrays.toString(portada));
            }
        }
        
        return portada;
    }
}
