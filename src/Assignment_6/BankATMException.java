
package Assignment_6;                                                  
@SuppressWarnings("serial")												
public class BankATMException extends RuntimeException {				
	private String message;												
	public BankATMException(String message) {							
        this.message = message;}										
	public BankATMException(Throwable cause, String message) {			
        super(cause);													
        this.message = message;}										
	public String getMessage() {										
        return message;}                                               
}																		
