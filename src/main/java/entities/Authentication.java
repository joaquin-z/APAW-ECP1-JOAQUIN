package entities;

public class Authentication {
    
    private int id;
    
    private User user;
    
    private Rol rol;
    
    public Authentication(int id, User user, Rol rol) {
        this.id = id;
        this.user = user;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
    
    public Rol getRol() {
        return rol;
    }

}
