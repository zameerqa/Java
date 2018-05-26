package Polymorphism;

public class PolymorphismDemo {
	PolymorphismDemo p2;
	public static void main(String[] args) {
		/*Parent p=new Parent();
		p.m1();
		Child c=new Child();
		c.m1();
		c.m2();*/
		Parent p1=new Child();
		p1.m1();
		p1.m2();
		 p1=new Child2();
		p1.m2();
		
		//p1.m2();
		
		
		

	}

}
