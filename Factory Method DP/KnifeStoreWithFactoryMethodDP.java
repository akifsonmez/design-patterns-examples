// factory method pattern

public abstract class KnifeStore {
	
	public Knife orderKnife(String knifeType) {
		
		Knife knife;
		
		// now creating a knife is a method in the class
		knife = createKnife(knifeType)
		
		// thia is still the same as before!
		knife.sharpen();
		knife.polish();
		knife.package();
		
		return knife;
	
	}
	
	abstract Knife createKnife(String knifeType);
}


....

public BudgetKnifeStore extends KnifeStore {
	
	// up to any subclass of KnifeStore to define this method
	Knife createKnife(String knifeType) {
		if (knifeType.equals("steak"))
			return new BudgetSteakKnife();
		else if (knifeType.equals("chefs"))
			return new BudgetChefsKnife();
		
		// .. more types
		
		else return null;
	}
	
}

