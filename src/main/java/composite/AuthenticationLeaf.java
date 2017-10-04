package composite;

import entities.Authentication;

public class AuthenticationLeaf extends AuthenticationComponent {

    private Authentication authentication;

    public AuthenticationLeaf(int id, Authentication authentication) {
        super(id);
        this.authentication = authentication;
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

    public Authentication getAuthentication() {
        return authentication;
    }

}
