....

// more interfaces can be used in facade dp !!
public interface IAccount {
	public void deposit(BigDecimal amount);
	public void withdraw(BigDecimal amount);
	public void transfer(BigDecimal amount);
	public int getAccountNumber();
}

....

public class Chequing implements IAccount { ... }
public class Saving implements IAccount { ... }
public class Invesment implements IAccount { ... }

....

public class BankService {
	private Hashtable<int, IAccount> bankAccounts;

	public BankService() {
		this.bankAccounts = new Hashtable<int, IAccount>
	}
	
	public int createNewAccount(String type, BigDecimal initAmount) {
		IAccount newAccount = null;
		switch (type) {
			case "chequing":
				newAccount = new Chequing(initAmount);
				break;
			case "saving":
				newAccount = new Saving(initAmount);
				break;
			case "invesment":
				newAccount = new Invesment(initAmount);
				break;
			default:
				System.out.println("Invalid account type")
		}
		if(newAccount != null) {
			this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			return  newAccount.getAccountNumber()
		}
		return -1;
	}
	
	public void transferMoney(int to, from, BigDecimal amount) {
		IAccount toAccount = this.bankAccounts.get(to);
		IAccount fromAccount = this.bankAccounts.get(from);
		fromAccount.transfer(toAccount, BigDecimal amount)
	}
}

.....	
		