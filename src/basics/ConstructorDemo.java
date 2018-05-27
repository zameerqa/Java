package basics;
/*
* author : Zameer
* Example for Constructor
*/
public class ConstructorDemo {

	/*
	 final static int x=10;
	 final static int b=20;
	 final static int c;

	 */
	ConstructorDemo(){
		System.out.println("Hi");
		//b=30;
		//c=20;

	}


	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();
		//cd.x=20;
		//System.out.println(cd.x);
		/*try{
			System.out.println("Hai");
			Thread.sleep(2000);
			System.out.println("Bye");
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		System.out.println(System.getProperty("user.dir"));
	}

}
