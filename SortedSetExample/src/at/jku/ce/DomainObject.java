package at.jku.ce;

public class DomainObject {

/** * Default constructor */
	
	public String Uuid;
	private String name;	
	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) {
		super(); this.id = id; 
	}

	public String getUuId() {
 		return id; 
	}
}
