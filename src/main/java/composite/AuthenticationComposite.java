package composite;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationComposite extends AuthenticationComponent {
    
    List<AuthenticationComponent> authenticationComponentList;

    public AuthenticationComposite(int id) {
        super(id);
        authenticationComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(AuthenticationComponent authenticationComponent) {
        assert authenticationComponent != null;
        authenticationComponentList.add(authenticationComponent);
    }

    @Override
    public void remove(AuthenticationComponent authenticationComponent) {
        assert authenticationComponent != null;
        authenticationComponentList.remove(authenticationComponent);
    }

}
