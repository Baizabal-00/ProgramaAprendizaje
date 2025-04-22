package minijuegoslectogo.controladores;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionPostgrest {

    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String DB = "lectogo";
    private final String USER = "postgres";
    private final String PASWORD = "NochEinmal117";

    public Connection conexion;
    public Statement stmt;

    public Connection getConexion() {
        conexion = null;
        stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + DB;
            conexion = DriverManager.getConnection(url, USER, PASWORD);
            stmt = conexion.createStatement();
            System.out.println("Se logro");
        } catch (Exception e) {
            System.out.println("error: " + e);
            System.out.println("no hay :(");

        }

        return conexion;
    }

}
