
public class EncapsulationAccount {

	public static void main(String[] args) {
		
		encapsulation e = new encapsulation();
		
		e.setAccno(100);
		int AccountNo = e.getAccno();
		System.out.println("Bank Account Noumber is  " +AccountNo);
		
		e.setName("Sathish Reddy");
		String Name = e.getName();
		System.out.println("Bank Customer name is  " +Name);
		
		e.setAmount(100000.254);
		double amount = e.getAmount();
		System.out.println("Customer Amount is  "+amount);
		
		
	}
}
