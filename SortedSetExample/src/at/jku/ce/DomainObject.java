package at.jku.ce;

public class DomainObject {

	/** 
	* Default constructor 
	*/
	
	private String uuid = UUID.randomUUID().toString();
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
