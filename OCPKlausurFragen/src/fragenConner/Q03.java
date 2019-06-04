package fragenConner;

public class Q03 {

	/*4*/	void doStuff() throws ArithmeticException, NumberFormatException, Exception {
	/*5*/		if (Math.random() > -1) 
							throw new Exception ("Try again"); 
				}


	public static void main(String[] args) {
		
/*24*/		try {
/*25*/			doStuff();
/*26*/		} catch(ArithmeticException | NumberFormatException | Exception e) {
/*27*/			System.out.println(e.getMessage());
			} catch(Exception e) {
/*29*/			System.out.println(e.getMessage());
/*30*/		}
	}
	
	
	/*
	 * Which modification enables the code to print Try again?
	 * 
	 * A. Comment the lines 28, 29 and 30.
	 * 
	 * B. Replace line 26 with:
	 * 		} catch (Exception | ArithmeticException | NumberFormatException e) {
	 * 
	 * C.Replace line 26 with:
	 * 		} catch (ArithmeticException | NumberFormatException e) {
	 * 
	 * D.Replace line 27 with:    throw e;
	 * 
	 * 
	 * Correct Answer: C
	 */

}
