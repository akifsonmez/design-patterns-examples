// with factory object

public class KnifeFactory {
	
	public Knife createKnife(String knifeType) {
		
		Knife knife = null;
		
		// create Knife object
		if (knifeType.equals("steak"))
			knife = new SteakKnife();
		else if (knifeType.equals("chefs"))
			knife = new ChefsKnife();
		
		return knife;
	}
	
	
}


///////////////////////////////////////////

public class KnifeStore {
	
	private KnifeFactory factory;
	
	//require a KnifeFactory object to be passes to this constructor
	public KnifeStore(KnifeFactory factory){
	
		this.factory = factory;
	}
	
	public orderKnife(String knifeType) {
		
		Knife knife;
		
		// use the create method in the factory
		knife = factory.createKnife(knifeType);
		
		// prepare the Knife
		
		knife.sharpen();
		knife.polish();
		knife.package();
		
		return knife;
	}
}