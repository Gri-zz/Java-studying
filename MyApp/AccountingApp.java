
public class AccountingApp {

	public static void main(String[] args) {
	
		double valueOfSupply = 12345.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ (valueOfSupply*vatRate) );
		System.out.println("Total : "+ (valueOfSupply + valueOfSupply*vatRate) );
		System.out.println("Expense : "+ (valueOfSupply*expenseRate) );
		System.out.println("Income : "+ (valueOfSupply - valueOfSupply*expenseRate) );
		System.out.println("Dividened 1 : "+ (valueOfSupply - valueOfSupply*0.3) * 0.5);
		System.out.println("Dividened 2 : "+ (valueOfSupply - valueOfSupply*0.3) * 0.3);
		System.out.println("Dividened 3 : "+ (valueOfSupply - valueOfSupply*0.3) * 0.2);
		
	}

}
