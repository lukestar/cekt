package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(new DomainObject("Helga","comment")); 
		objectSet.add(new DomainObject("Walter","comment")); 
		objectSet.add(new DomainObject("Hannah","comment")); 
		objectSet.add(new DomainObject("Paul","comment")); 
		objectSet.add(new DomainObject("Claudia","comment"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getuuid());
		}
	}

}
