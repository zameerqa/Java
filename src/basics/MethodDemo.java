package basics;

public class MethodDemo {
	public static void m1(){
		int a,b,c;
		a=5;
		b=10;
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		m1();
	}
	
	public void m2(){
		System.out.println("M2 method");
		m1();
	}

}
