package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try{
			System.out.println("Hi");
			System.out.println("GM");
			System.out.println(2/0);
			System.out.println("GN");
		}

		catch(ArithmeticException e){
			System.out.println("Hello");
		}

		catch(Exception e){
			System.out.println("Bye");
		}

		finally {
			System.out.println("Punit");
		}



	}

}
