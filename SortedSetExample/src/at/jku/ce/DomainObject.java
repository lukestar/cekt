package at.jku.ce;

public class DomainObject {

	/** 
	* Default constructor 
	*/
	
	public String id = UUID.randomUUID().toString();
	private String name;

	
	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) {
		super(); this.id = id; 
	}

	public String getId() {
 		return id; 
	}
}
