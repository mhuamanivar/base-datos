package empdis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conector {
    private Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/emp_dis", "root", "");
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encuentra el driver de la base de datos");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return conectar;
    }
}