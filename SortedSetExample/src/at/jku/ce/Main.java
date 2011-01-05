package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(DomainFactory.createDomainObject(("Helga","comment")); 
		objectSet.add(DomainFactory.createDomainObject(("Walter","comment")); 
		objectSet.add(DomainFactory.createDomainObject(("Hannah","comment")); 
		objectSet.add(DomainFactory.createDomainObject(("Paul","comment")); 
		objectSet.add(DomainFactory.createDomainObject(("Claudia","comment"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getuuid());
		}
	}

}
