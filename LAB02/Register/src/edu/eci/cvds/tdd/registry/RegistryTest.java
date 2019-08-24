package edu.eci.cvds.tdd.registry;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void deberiaEdadInvalida() {
    	Person person = new Person("Pedro",1,-4,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);    
    	System.out.print("HI");
    }
}
