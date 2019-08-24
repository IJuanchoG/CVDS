package edu.eci.cvds.tdd.registry;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void deberiaEdadInvalida() {
    	Person person = new Person("Pedro",1,-1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);    
    	Person person = new Person("Pedro",1,-0,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);    
    }
}
