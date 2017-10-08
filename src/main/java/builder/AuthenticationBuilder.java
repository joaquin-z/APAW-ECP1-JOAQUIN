package builder;

import java.util.Calendar;

import entities.Authentication;
import entities.Rol;
import entities.User;

public class AuthenticationBuilder {
    
    private int id;
    
    private Authentication authentication;

    private Rol rol;

    private User user;
    
    public AuthenticationBuilder(int id) {
        this.id = id;
    }
    
    public AuthenticationBuilder user(long id, String name, Calendar birthday, boolean active) {
        User user = new User(id, name, birthday, active);
        this.user = user;
        return this;
    }
    
    public AuthenticationBuilder rol(Rol rol) {
        this.rol = rol;
        return this;
    }
    
    public Authentication build() {
        authentication = new Authentication(this.id, this.user, this.rol);
        return this.authentication;
    }

}
