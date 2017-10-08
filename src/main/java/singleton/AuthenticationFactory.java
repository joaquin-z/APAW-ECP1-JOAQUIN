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
    
    public void setAuthenticationFactory(Authentication authentication) {
        this.authentications.put(authentication.getId(),authentication);
    }
    
    public Authentication getAuthenticationFactory(int id) {
        return authentications.get(id);
    }

    public int getId() {
        return id;
    }

}
