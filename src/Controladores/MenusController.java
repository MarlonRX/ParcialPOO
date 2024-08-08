/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Menus;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Marlon Ramirez
 */
public class MenusController implements IGenericController{
    
    private ConnectionSQLController conectController;

    Connection conect = conectController.obtenerConexion();
    
    
    @Override
    public boolean crearRegistro(Object object) {
        //Ejemplo casting
        Menus menu = (Menus) object;

        // Ejemplo de conversión de List<String> a String
        List<String> extras = menu.getExtras();
        String extrasString = String.join(", ", extras);

        try {
            String sql = "INSERT INTO menus (tipo_menu, extras, nombre, direccion, celular) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, menu.getTypeMenu());
            ps.setString(2, extrasString);
            ps.setString(3, menu.getClientName());
            ps.setString(4, menu.getCLientAdresss());
            ps.setString(5, menu.getNumber());
            ps.executeUpdate();
            System.out.println("Registro insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e);
        }
        return true;
    }
    
    @Override
    public String obtenerMenu(int type)
    {
        String MenuString = "";
        if (type == 1) {
            MenuString = "Menu de ensalada con papas y jugo";
        }
        if (type == 2) {
            MenuString = "Una Hamburguesa con carne, papas y gaseosa";
        }
        if (type == 3) {
            MenuString = "Una Pizza con papas y gaseosa";
        }
        if (type == 4) {
            MenuString = "Salchipapa con gaseosa y queso";
        }
        if (type == 5) {
            MenuString = "Papa rellena con gaseosa";
        }
        if (type == 6) {
            MenuString = "Empanada con gaseosa";
        }
        if (type == 7) {
            MenuString = "Combo de Malteada con galleta y un regalito";
        }
        if (type == 8) {
            MenuString = "Combo de hamburguesas para compartir en pareja";
        }
        if (type == 9) {
            MenuString = "Combo de dos pollos con gaseosa familiar";
        }
        if (type == 10) {
            MenuString = "Combo de dos presas de pollo";
        }
        if (type == 11) {
            MenuString = "Combo de minipiñata con dulces";
        }
        if (type == 12) {
            MenuString = "Arepas con carne tostada";
        }
        
        return MenuString;
    }
    
    
}
