package composite;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import builder.AuthenticationBuilder;
import entities.Authentication;
import entities.Rol;

public class AuthenticationCompositeTest {
    
    private Authentication authentication;

    private AuthenticationLeaf authenticationLeaf;

    private AuthenticationComposite authenticationComposite;
    
    @Before
    public void before() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(1991,12,16);
        
        this.authentication = new AuthenticationBuilder(1).user(1, "nombre1", fecha, true).rol(Rol.ADMIN).build();

        this.authenticationLeaf = new AuthenticationLeaf(authentication);

        this.authenticationComposite = new AuthenticationComposite("empleados");
    }

    @Test
    public void testView() {
        assertEquals(1, this.authenticationLeaf.view());
    }

    @Test
    public void testName() {
        assertEquals("empleados", this.authenticationComposite.name());
}
    
}
