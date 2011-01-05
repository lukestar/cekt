package at.jku.ce;

public class DomainObject {

	/** 
	* Default constructor 
	*/
	
	public String id = UUID.randomUUID().toString();
	private String name;

	
<<<<<<< HEAD
=======
	public String Uuid;
	private String name;	
>>>>>>> 1bc1647f629aa63c193d4f73e2140068a577ba77
	
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
