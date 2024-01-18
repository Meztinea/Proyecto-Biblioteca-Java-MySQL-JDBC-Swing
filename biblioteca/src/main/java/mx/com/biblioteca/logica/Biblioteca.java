
package mx.com.biblioteca.logica;

/**
 *
 * @author Raquel Martínez
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Biblioteca {
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/biblioteca?useTimeZone=true&serverTimeZone=UTC", 
                "root", 
                "123456");
        System.out.println("Exito");
        con.close();
        
    }
}
