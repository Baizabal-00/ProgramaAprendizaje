
package Modelos;

import java.util.ArrayList;

public abstract class CRUD {
    public abstract void create(Usuario usuario);
    public abstract ArrayList<Usuario> read();
    public abstract void update(Usuario usuario);
    public abstract void delete(Usuario usuario);
    
}
