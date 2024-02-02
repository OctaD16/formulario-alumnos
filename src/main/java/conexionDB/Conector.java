package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author octad
 */
public class Conector {

    Connection conectar = null;

    /*declaracion de variables que contendran la informacion necesaria
para establecer la conexion a la base de datos*/
    String usuario = "root";//informacion que viene por defecto
    String password = "";//en caso de tener contraseña, establecer, sino dejar vacio
    String db = "Parcial_2023";//nombre de la base de datos
    String driver = "com.mysql.cj.jdbc.Driver";//controlador
    //construccion de la URL
    String url = "jdbc:mysql://localhost:3306/" + db;

    //proceso de comunicacion con la base de datos
    public Connection conectar() {
        try {
            Class.forName(driver);
            conectar = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se puedo establecer la conexion " + e);
        }
        return conectar;
    }
}
