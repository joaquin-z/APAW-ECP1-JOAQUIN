package entities;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
    
    private int id;
    
    private Map<Integer, User> users;
    
    private Map<Integer, Rol> rols;
    
    public Authentication() {
        this.id = 0;
        this.users = new HashMap<>();
        this.rols = new HashMap<>();
    }
    
    public void setAuthentication(int id, Rol rol, User user) {
        this.id = id;
        this.rols.put(id,rol);
        this.users.put(id,user);
    }

    public int getId() {
        return id;
    }

    public User getUser(int key) {
        return users.get(key);
    }

    public void removeUser(int key) {
        this.users.remove(key);
    }
    
    public Rol getRol(int key) {
        return rols.get(key);
    }

    public void removeRol(int key) {
        this.rols.remove(key);
    }

}
