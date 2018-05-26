
public class Increment_DecrementOPerations {

	public static void main(String[] args) {
		int a=1;
		int b=a++;
		int c=++b;
		int d=++a + c-- + --b;
		int e=a+b+c+d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
