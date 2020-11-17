
// CoffeeMachineInterface.java
public interface CoffeeMachineInterface {
	public void chooseFirstSelection(); 
	public void chooseSecondSelection();

}

// OldCoffeeMachine.java
public class OldCoffeeMachine {

	public selectA(){ 
		System.out.println("A - Selected");
	}
	public selectB(){ 
		System.out.println("B - Selected")
	}
}

// CoffeeTouchscreenAdapter.java
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	private OldCoffeeMachine oldVendingMachine;
	
	public void connect(OldCoffeeMachine oldCoffeeMachine){
		this.oldCoffeeMachine = oldVendingMachine;
	}
	
	public void chooseFirstSelection(){
		oldCoffeeMachine.selectA();
	}
	
	public void chooseSecondSelection(){
		oldCoffeeMachine.selectB();
	}

}
