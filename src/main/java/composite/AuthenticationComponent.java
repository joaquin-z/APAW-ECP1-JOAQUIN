package composite;

public abstract class AuthenticationComponent {
    
    private int id;

    public AuthenticationComponent(int id) {
        this.id = id;
    }
    
    public abstract boolean isComposite();
    
    public abstract void add(AuthenticationComponent authenticationComponent);
    
    public abstract void remove(AuthenticationComponent authenticationComponent);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
