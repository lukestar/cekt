package at.jku.ce; 

public class DomainFactory { 
	protected static DomainObject createDomainObject(String name, String comment) { 
		return new DomainObject(name, comment); 
	} 
}