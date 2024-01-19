package mx.com.biblioteca.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Raquel Martínez
 */


public class ConexionBD {
    
    public Connection crearConexion() throws SQLException{
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/biblioteca?useTimeZone=true&serverTimeZone=UTC", 
                "root", 
                "123456");
    }
    
}
