package at.jku.ce;

public class DomainObject implements Comparable<DomainObject>{

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
	
	public void setComment(final String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 


	public String toString() { 
	return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; 
	}
	
	public void setName(final String name) { 
		this.name = name; 
	}

	public int compareTo(DomainObject o) { 
		DomainObject domainObj = (DomainObject) o; 
		int domObjeComp = name.compareTo(domainObj.getName()); 
		return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : domObjeComp); 
	}
		
}
