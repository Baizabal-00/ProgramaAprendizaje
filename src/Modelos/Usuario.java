package Modelos;

public class Usuario {
    Integer id;
    String usuario1;
    String contraseña;

    public Usuario(String usuario1, String contraseña) {
        this.usuario1 = usuario1;
        this.contraseña = contraseña;
    }

    
    
    
    public Usuario(Integer id, String usuario, String contraseña) {
        this.id = id;
        this.usuario1 = usuario;
        this.contraseña = contraseña;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
