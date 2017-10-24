
package Assignment_6;																					
public class BankAtm {																					
	int atmId;																							
	String bankName;																					
	String location;																					
	double balance;																						
	
	public BankAtm(int atmId, String bankName, String location, int balance) {							
		this.atmId = atmId;																				
		this.bankName = bankName;																		
		this.location = location;																		
		this.balance = balance;																			
		System.out.println("=========================================" );								
		System.out.println("ATM ID                     : " +this.atmId );								
		System.out.println("Bank Name                  : " +this.bankName );							
		System.out.println("Location                   : " +this.location );							
		System.out.println("Balance                    : " +this.balance );								
		System.out.println("=========================================" );}								
	
	public void withdraw(double amount)throws BankATMException{											
		System.out.println("Amount Withdraw            : " +amount );									
		if(amount>balance){																				
			throw new BankATMException("Balance is less than 10000. You Cannot withdraw Money");}		
		else{																							
			balance=balance-amount;
			System.out.println("New Balance After Withdraw : "+balance);}								
	}																									
	public void deposit(double amount)throws BankATMException {											
		System.out.println("Amount Deposit             : " +amount );									
		if(amount<=0.0){																				
			throw new BankATMException("Cannot deposit Money");											
	}else{																								
		balance =balance+amount;																		
		System.out.println("New Balance After Deposit  : "+balance+"\n");								
		System.out.println("---------End of the Statement-----------\n");}								
	}																									
}																										

