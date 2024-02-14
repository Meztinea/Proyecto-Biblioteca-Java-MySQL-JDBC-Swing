
package mx.com.biblioteca.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mx.com.biblioteca.logica.Libro;
import java.sql.ResultSet;
/**
 *
 * @author Raquel Martínez
 */
public class LibroP {

    public static ResultSet consultarLibros() throws SQLException {
        Connection conexionBD = new ConexionBD().crearConexion();
        
        String sql = "SELECT id, titulo, autor, editorial, ejemplaresDisponibles FROM libros";
        PreparedStatement pstmt = conexionBD.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        
        pstmt.close();
        conexionBD.close();
        return rs;
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
}
