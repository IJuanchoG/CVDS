package edu.eci.cvds.tdd.registry;

import java.util.Hashtable;

public class Registry {
	private Hashtable <Integer, Person> registrados = new Hashtable<Integer, Person>();
	private final int EDADMAXIMA = 122, EDADMINIMA = 18; 

    public RegisterResult registerVoter(Person p) {
    	RegisterResult res = RegisterResult.VALID;
    	if (p.getAge()<0 || p.getAge()>EDADMAXIMA  )
    		res = RegisterResult.INVALID_AGE;
    	else if(p.getAge()>=0 && p.getAge()<EDADMINIMA && p.isAlive())
    		res = RegisterResult.UNDERAGE;
    	else if(p.getAge()>=0 && p.getAge()<=EDADMAXIMA  && !p.isAlive())
    		res = RegisterResult.DEAD;
    	else if(p.getAge()>=EDADMINIMA && p.getAge()<=EDADMAXIMA  && p.isAlive() && registrados.contains(p.getId()))
    		res = RegisterResult.DUPLICATED;
    	else if(p.getAge()>=EDADMINIMA && p.getAge()<=EDADMAXIMA  && p.isAlive() && registrados.contains(p.getId()))
    		res = RegisterResult.VALID;
        return res;
    }
}

