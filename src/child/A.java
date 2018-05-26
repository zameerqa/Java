package child;
/*
* author : zameer
* Parent Class
*/
public class A {
	
	public static int x=10;
	private static int y=20;
	static protected int z=30;
	static int g=60;
	public  void m1(){
		int a=40;
		System.out.println("This is m1 method present in class A");
		System.out.println(a);
	}
	private static void m2(){
		System.out.println("This is m2 method present in class A");
		int b=50;
		System.out.println(b);
	}
	protected static void m3(){
		System.out.println("This is m2 method present in class A");
		int b=50;
		System.out.println(b);
	}
	 static void m4(){
		System.out.println("This is m2 method present in class A");
		int b=50;
		System.out.println(b);
	}

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		a.m1();
		a.m2();
	}

}
