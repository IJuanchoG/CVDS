package edu.eci.cvds.tdd.registry;

import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;

public class RegistryTest {
    private Random r = new Random();
    Person person;
    
    @Test
    public void primerCondicion(){
        Registry registry = new Registry();
        // CASO DE FRONTERA IZQ -1
    	person = new Person("Pedro",1,-1,Gender.MALE,true);
        assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);   
        // CASO DE FRONTERA IZQ 0
                // SI ESTÃ� VIVO
        person = new Person("Pedro",2,0,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE); 
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",3,0,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA IZQ 1
                // SI ESTÃ� VIVO
        person = new Person("Pedro",4,1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);  
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",5,1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD);  
        // VALOR CENTRAL
                // SI ESTÃ� VIVO
                        // EDAD MINIMA
        person = new Person("Pedro",6,r.nextInt(Registry.EDADMINIMA),Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);
        person = new Person("Pedro",7,r.nextInt(Registry.EDADMINIMA),Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // VALOR DE FRONTERA DER 121        
                // SI ESTÃ� VIVO
        person = new Person("Pedro",8,121,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID); 
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",9,121,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // VALOR DE FRONTERA DER 122        
                // SI ESTÃ� VIVO
        person = new Person("Pedro",10,122,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID); 
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",11,122,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // VALOR DE FRONTERA DER 123
        person = new Person("Pedro",12,123,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);
        
    	
    }
    
    @Test
    public void segundaCondicion(){
        Registry registry = new Registry();
        // CASO DE FRONTERA IZQ -1
    	Person person = new Person("Pedro",1,-1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);   
        // CASO DE FRONTERA IZQ 0
                // SI ESTÃ� VIVO
        person = new Person("Pedro",2,0,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE); 
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",3,0,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA IZQ 1
                // SI ESTÃ� VIVO
        person = new Person("Pedro",4,1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);  
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",5,1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD);  
        // VALOR CENTRAL
                // SI ESTÃ� VIVO
                        // EDAD MINIMA
        person = new Person("Pedro",6,r.nextInt(Registry.EDADMINIMA),Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);
                // MUERTO
        person = new Person("Pedro",7,r.nextInt(Registry.EDADMINIMA),Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA DER 17
                // SI ESTÃ� VIVO
        person = new Person("Pedro",8,17,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);  
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",9,17,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA DER 18
                // SI ESTÃ� VIVO
        person = new Person("Pedro",10,18,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);  
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",11,18,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA DER 19
                // SI ESTÃ� VIVO
        person = new Person("Pedro",12,19,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);  
                // SI ESTÃ� MUERTO
        person = new Person("Pedro",13,19,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD);
        
        
    }
    
    @Test
    public void tercerCondicion(){
        Registry registry = new Registry();
        // CASO DE FRONTERA IZQ -1
    	Person person = new Person("Pedro",1,-1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);   
        // CASO DE FRONTERA IZQ 0
        person = new Person("Pedro",1,0,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA IZQ 1
        person = new Person("Pedro",1,1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // VALOR CENTRAL
        person = new Person("Pedro",1,r.nextInt(Registry.EDADMAXIMA),Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD); 
        // CASO DE FRONTERA DER EDADMAXIMA-1
        person = new Person("Pedro",1,Registry.EDADMAXIMA-1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD);
        // CASO DE FRONTERA DER EDADMAXIMA
        person = new Person("Pedro",1,Registry.EDADMAXIMA,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DEAD);
        // CASO DE FRONTERA DER EDADMAXIMA+1
        person = new Person("Pedro",1,Registry.EDADMAXIMA+1,Gender.MALE,false);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE);
    
    }
    
    @Test
    public void cuartaCondicion(){ 
        Registry registry = new Registry();        
        registry.registerVoter(new Person("Pedao",1,22,Gender.MALE,true));
        
        // CASO DE FRONTERA IZQ EDADMINIMA-1
    	Person person = new Person("Pedro",1,Registry.EDADMINIMA-1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);   
        // CASO DE FRONTERA IZQ EDADMINIMA 
    	person = new Person("Pedro",1,Registry.EDADMINIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DUPLICATED); 
        // CASO DE FRONTERA IZQ EDADMINIMA+1      
    	person = new Person("Pedro",1,Registry.EDADMINIMA+1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DUPLICATED);         
        // VALOR CENTRAL
        person = new Person("Pedro",1,r.nextInt(Registry.EDADMAXIMA-Registry.EDADMINIMA)+Registry.EDADMINIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DUPLICATED);
        // CASO DE FRONTERA DER EDADMAXIMA-1     
    	person = new Person("Pedro",1,Registry.EDADMAXIMA-1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DUPLICATED);    	
        // CASO DE FRONTERA DER EDADMAXIMA        
    	person = new Person("Pedro",1,Registry.EDADMAXIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.DUPLICATED);     	
        // CASO DE FRONTERA DER EDADMAXIMA+1       
    	person = new Person("Pedro",1,Registry.EDADMAXIMA+1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE); 
    	
    }
    @Test
    public void quintaCondicion(){ 
        Registry registry = new Registry();        
        
        // CASO DE FRONTERA IZQ EDADMINIMA-1
    	Person person = new Person("Pedro",1,Registry.EDADMINIMA-1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.UNDERAGE);   
        // CASO DE FRONTERA IZQ EDADMINIMA 
    	person = new Person("Pedro",2,Registry.EDADMINIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID); 
        // CASO DE FRONTERA IZQ EDADMINIMA+1      
    	person = new Person("Pedro",3,Registry.EDADMINIMA+1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);         
        // VALOR CENTRAL
        person = new Person("Pedro",4,r.nextInt(Registry.EDADMAXIMA-Registry.EDADMINIMA)+Registry.EDADMINIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);
        // CASO DE FRONTERA DER EDADMAXIMA-1     
    	person = new Person("Pedro",5,Registry.EDADMAXIMA-1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);    	
        // CASO DE FRONTERA DER EDADMAXIMA        
    	person = new Person("Pedro",6,Registry.EDADMAXIMA,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.VALID);     	
        // CASO DE FRONTERA DER EDADMAXIMA+1       
    	person = new Person("Pedro",7,Registry.EDADMAXIMA+1,Gender.MALE,true);    	
    	assertEquals(registry.registerVoter(person),RegisterResult.INVALID_AGE); 
    	
    }
}
