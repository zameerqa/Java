package constructor;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		
		System.out.println("Default Constructor");
	}
	
	ConstructorOverloading(int x){
		this(5,2);
		System.out.println("One Parameterized Constructor");
	}
	ConstructorOverloading(int x, int y){
		this();
		System.out.println("Two Parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorOverloading cs=new ConstructorOverloading(5);

	}

}
