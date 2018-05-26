package basics;

public class ConstructorDemo2 {
	
	
	 final  int x=10;
	 final  int b=15;
	   int c;
	   public void m3(){
		   final int a;
		   a=5;
		   int b=20;
		   int c = a+b;
		   
	   }
	 
	 
/*	ConstructorDemo2(){
		
		b=30;
		c=20;
		
	}*/
	   
	

	public static void main(String[] args) {
		ConstructorDemo2 cd=new ConstructorDemo2();
		
		System.out.println(cd.x);

	}

}
