

public class Multiple_Exceptions {

	public static void main(String[] args) {
		try {
//			//ArithmeticException --1
//			int div =10/0;
//			
//			//ArrayIndexOutOfBoundException --2
//			int []numbers= {1,2,3,4,5};
//			System.out.println("My numbers:"+numbers[10]);
			
			//StringIndexOutOfBoundException --3
			String name="Dolly";
			System.out.println("My Name:"+name.charAt(15));
			
//			//NullPointerException
//			String a=null;
//			System.out.println("My String:"+a.length());
			
		}catch(ArithmeticException e) {
			System.out.println("This is my First"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This is my Second"+e);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("This is my Third"+e);
			
		}catch(NullPointerException e) {
			System.out.println("This is my Fourth"+e);
			
		}
		finally {
			
			System.out.println("My four Errors Sloving..");
		}

	}

}