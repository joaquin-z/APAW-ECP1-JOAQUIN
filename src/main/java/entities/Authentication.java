package entities;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
    
    private int id = 0;
    
    private Map<Integer, User> users = new HashMap<>();
    
    private Map<Integer, Rol> rols = new HashMap<>();
    
    public Authentication(int id, Rol rol, User user) {
        this.id = id;
        this.rols.put(id,rol);
        this.users.put(id,user);
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return users.get(this.id);
    }

    public void removeUser() {
        this.users.remove(this.id);
    }
    
    public Rol getRol() {
        return rols.get(this.id);
    }

    public void removeRol() {
        this.rols.remove(this.id);
    }

}
