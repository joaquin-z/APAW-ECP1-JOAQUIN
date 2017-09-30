package singleton;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

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
        User user1 = new User(1,"nombre1",fecha,true);
        Authentication authentication = new Authentication(1,Rol.ADMIN,user1);
        User user2 = new User(2,"nombre2",fecha,true);
        Authentication authentication2 = new Authentication(2,Rol.CUSTOMER,user2);
        User user3 = new User(3,"nombre3",fecha,true);
        Authentication authentication3 = new Authentication(3,Rol.MANAGER,user3);
        authenticationFactory.setAuthenticationFactory(1,authentication);
        authenticationFactory.setAuthenticationFactory(2,authentication2);
        authenticationFactory.setAuthenticationFactory(3,authentication3);
        assertSame("nombre1", authenticationFactory.getAuthenticationFactory(1).getUser().getName());
        assertSame(Rol.CUSTOMER, authenticationFactory.getAuthenticationFactory(2).getRol());
        assertSame(3, authenticationFactory.getAuthenticationFactory(3).getUser().getId());
    }
    
}
