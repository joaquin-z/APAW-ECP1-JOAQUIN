package composite;

public abstract class AuthenticationComponent {
    
    public abstract boolean isComposite();
    
    public abstract void add(AuthenticationComponent authenticationComponent);
    
    public abstract void remove(AuthenticationComponent authenticationComponent);

}
