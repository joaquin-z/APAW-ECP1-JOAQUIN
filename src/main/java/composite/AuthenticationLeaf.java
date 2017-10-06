package composite;

import entities.Authentication;

public class AuthenticationLeaf extends AuthenticationComponent {

    private Authentication authentication;

    public AuthenticationLeaf(Authentication authentication) {
        this.authentication = authentication;
    }
    
    public int view() {
        return authentication.getId();
    }

    public Authentication getAuthentication() {
        return authentication;
    }
    
    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(AuthenticationComponent authenticationComponent) {
     // Do nothing because is leaf
    }

    @Override
    public void remove(AuthenticationComponent authenticationComponent) {
        // Do nothing because is leaf
    }

}
