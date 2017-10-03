package builder;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import entities.Authentication;
import entities.Rol;

public class AuthenticationBuilderTest {

    @Test
    public void testNewAuthentication() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(1991,12,16);
        Authentication authentication;
        authentication = new AuthenticationBuilder(1).user(1, "nombre1", fecha, true).rol(Rol.ADMIN).build();
        assertSame(1, authentication.getId());
        authentication = new AuthenticationBuilder(2).user(2, "nombre2", fecha, true).rol(Rol.CUSTOMER).build();
        assertSame("nombre2", authentication.getUser().getName());
        authentication = new AuthenticationBuilder(3).user(3, "nombre3", fecha, true).rol(Rol.MANAGER).build();
        assertSame(Rol.MANAGER, authentication.getRol());
    }

}
