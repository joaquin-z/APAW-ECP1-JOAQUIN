package composite;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationComposite extends AuthenticationComponent {
    
    private List<AuthenticationComponent> authenticationComponentList;
    
    private String name;

    public AuthenticationComposite(String name) {
        super();
        this.name = name;
        authenticationComponentList = new ArrayList<>();
    }

    public String name() {
        return this.name;
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
