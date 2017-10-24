
package Assignment_6;														
public class Assignment_6_4 {												
	public static void main(String[] args) {								
	BankAtm bank1=new BankAtm(1001, "SBI Bank", "Navi Mumbai", 20000);		
   	try {																	
			bank1.withdraw(500);											
			bank1.deposit(500);												
		}catch(Exception e) {												
			System.out.println("Exception occurred "+e);}					
	
   	BankAtm bank2=new BankAtm(1022, "Citi Bank", "Navi Mumbai", 30000);		
   	try {																	
			bank2.withdraw(2500);											
			bank2.deposit(500);												
		}catch(Exception e) {												
			System.out.println("Exception occurred "+e);}					

   	BankAtm bank3=new BankAtm(1221, "ICICI Bank", "Navi Mumbai", 10000);	
   	try {																	
			bank3.withdraw(10100);											
			bank3.deposit(500);												
   		}catch(Exception e) {												
			System.out.println("Exception occurred "+e);}					
	}																		
}																			