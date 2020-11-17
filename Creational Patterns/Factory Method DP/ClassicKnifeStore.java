// without factory object
....

Knife orderKnife(String knifeType){
		
		Knife knife;
		
		// create Knife object - concrete instantiation
		if (knifeType.equals("steak"))
			knife =  new SteakKnife();
		else if (knifeType.equals("chefs"))
			knife = new ChefsKnife();
		
		
		// prepare the Knife
		knife.sharpen();
		knife.polish();
		knife.package();
		
		return knife;


}

....