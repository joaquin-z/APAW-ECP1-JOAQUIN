package singleton;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import builder.AuthenticationBuilder;
import entities.Authentication;
import entities.Rol;
import entities.User;

public class AuthenticationFactoryTest {
    
    AuthenticationFactory authenticationFactory = AuthenticationFactory.getAuthenticationFactory();
    
    @Test
    public void testIsSingleton() {
        assertSame(AuthenticationFactory.getAuthenticationFactory(), AuthenticationFactory.getAuthenticationFactory());
    }
    
    @Test
    public void testSingletonNotNull() {
        assertNotNull(AuthenticationFactory.getAuthenticationFactory());
    }
    
    @Test
    public void testNewAuthentication() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(1991,12,16);
        Authentication authentication;
        authentication = new AuthenticationBuilder(1).user(1, "nombre1", fecha, true).rol(Rol.ADMIN).build();
        authenticationFactory.setAuthenticationFactory(authentication);
        authentication = new AuthenticationBuilder(2).user(2, "nombre2", fecha, true).rol(Rol.CUSTOMER).build();
        authenticationFactory.setAuthenticationFactory(authentication);
        authentication = new AuthenticationBuilder(3).user(3, "nombre3", fecha, true).rol(Rol.MANAGER).build();
        authenticationFactory.setAuthenticationFactory(authentication);
        assertEquals("nombre1", authenticationFactory.getAuthenticationFactory(1).getUser().getName());
        assertEquals(Rol.CUSTOMER, authenticationFactory.getAuthenticationFactory(2).getRol());
        assertEquals(3, authenticationFactory.getAuthenticationFactory(3).getUser().getId());
    }
    
}
