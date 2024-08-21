
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Adm
 */
public class conectaDAO {

    private static final String URL = "jdbc:mysql://localhost/uc11";
    private static final String USER = "root";
    private static final String PASSWORD = "1804";

    public Connection connectDB() {
        Connection conn = null;
        try {
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PASSWORD);

            conn = DriverManager.getConnection(URL, props);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
            erro.printStackTrace(); // Adiciona um printStackTrace para depuração
        }
        return conn;
    }
}
