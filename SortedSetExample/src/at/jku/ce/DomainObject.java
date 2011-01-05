package at.jku.ce;

public class DomainObject {

	/** 
	* Default constructor 
	*/
	
	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;
	
	public DomainObject() {
		super();
	}
	
public DomainObject(String name, String comment) {
		super(); this.id = id; 
	}

	public String getUuId() {
 		return id; 
	}
	
	public String getComment() { 
		return comment; 
	} 
	
	public void setComment(String comment) { 
		this.comment = comment; 
	}
}
