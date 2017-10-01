package singleton;

import java.util.HashMap;
import java.util.Map;

import entities.Authentication;

public class AuthenticationFactory {
    
    private static final AuthenticationFactory authenticationFactory = new AuthenticationFactory();
    
    private int id;
    
    private Map<Integer, Authentication> authentications;
    
    private AuthenticationFactory() {
        this.id = 0;
        this.authentications = new HashMap<>();
    }
    
    public static AuthenticationFactory getAuthenticationFactory() {
        return authenticationFactory;
    }
    
    public void setAuthenticationFactory(int id, Authentication authentication) {
        this.id = id;
        this.authentications.put(id,authentication);
    }

    public int getId() {
        return id;
    }

    public Authentication getAuthenticationFactory(int key) {
        return authentications.get(key);
    }

    public void removeAuthenticationFactory(int key) {
        this.authentications.remove(key);
    }

}
