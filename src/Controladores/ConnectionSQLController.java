/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marlon Ramirez
 */
public class ConnectionSQLController {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/parcialdb";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e);
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
    }
}
    

