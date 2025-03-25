public class Exception_array
{

	public static void main(String[] args) {
		
		
try { // we can only to create one , it throws the exceptions 
	int numbers[]= {1,2,3,4,5};
	
	System.out.println("My Array"+numbers [5]); //ArrayIndexOutOfBoundExcept
			
			
			
		}
		catch(ArrayIndexOutOfBoundsException e){ // Handling the exceptions or debugging 
			
			System.out.println("My Error:"+e);
		}
		
		
	}

}