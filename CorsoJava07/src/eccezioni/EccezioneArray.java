package eccezioni;

public class EccezioneArray {

	public static void main(String[] args) {
		  
		
		int[] a = {5,3,6,5,4};
		  // attenzione al <=...
		  
		try {
		for (int i=0; i<=a.length; i++) 
		  System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("si è verificata un'eccezione ArrayIOB");
		}
		
		catch(Exception e) {
			
			System.out.println("si è verificata un'eccezione!" + 
			e.getMessage());
			e.printStackTrace();
		
		}
		  
		  
		  System.out.println("Ciao"); 
	}

}
