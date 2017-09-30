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
        User user2 = new User(2,"nombre2",fecha,true);
        User user3 = new User(3,"nombre3",fecha,true);
        authenticationFactory.setAuthenticationFactory(1,Rol.ADMIN,user1);
        authenticationFactory.setAuthenticationFactory(2,Rol.CUSTOMER,user2);
        authenticationFactory.setAuthenticationFactory(3,Rol.MANAGER,user3);
        assertSame(authenticationFactory, AuthenticationFactory.getAuthenticationFactory());
    }
    
    @Test
    public void testGetAuthentication() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(1991,12,16);
        User user1 = new User(1,"nombre1",fecha,true);
        User user2 = new User(2,"nombre2",fecha,true);
        User user3 = new User(3,"nombre3",fecha,true);
        authenticationFactory.setAuthenticationFactory(1,Rol.ADMIN,user1);
        authenticationFactory.setAuthenticationFactory(2,Rol.CUSTOMER,user2);
        authenticationFactory.setAuthenticationFactory(3,Rol.MANAGER,user3);
        assertSame(authenticationFactory, AuthenticationFactory.getAuthenticationFactory());
    }

}
