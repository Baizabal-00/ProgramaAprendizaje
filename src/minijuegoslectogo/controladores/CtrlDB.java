package minijuegoslectogo.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CtrlDB {

    private static CtrlDB instancia;
    private Connection connection = null;

    private CtrlDB() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1/lectogo",
                    "postgres", "meliza280"
            );
            System.out.println(connection.isValid(50000) ? "TEST OK" : "TEST FAIL");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar con la base de datos.");
            throw new RuntimeException("No se pudo conectar a la base de datos", ex);
        }
    }

    public static CtrlDB getInstance() {
        if (instancia == null) {
            synchronized (CtrlDB.class) {
                if (instancia == null) {
                    instancia = new CtrlDB();
                }
            }
        }
        return instancia;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión.");
        }
    }

    public static void main(String[] args) {
        CtrlDB conexion = CtrlDB.getInstance();
        Connection conn = conexion.getConnection();

        if (conn != null) {
            System.out.println("Conexión exitosa a la base de datos");
        } else {
            System.out.println("Error en la conexión a la base de datos");
        }

        conexion.closeConnection();
    }

}
