package basics;

public class ExceptionHandler {

	public static void main(String[] args) {
		try{
			System.out.println("Hi");
			System.out.println("gm");
			System.out.println(2/0);

			System.out.println("Bye");
		}
		catch(ArithmeticException ae){
			//ae.printStackTrace();
			//System.out.println(ae.toString());
			//System.out.println(ae.getMessage());
			//System.out.println("Arithmetic Exception");
		}
		catch(Exception e){

		}



	}

}
