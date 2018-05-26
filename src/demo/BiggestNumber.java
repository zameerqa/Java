package demo;

public class BiggestNumber {

	public static void main(String[] args) {
		int x,y,z,big;
		x=2;
		y=7;
		z=4;
		/*if(x>y & x>z){
			System.out.println("x is Greatest");
		}
		else if(y>z){
			System.out.println("y is Greatest");
		}
		else
			System.out.println("z is Greatest");*/
		big=(x>y & x>z)?x:(y>z)?y:z;
		System.out.println(big+" is greatest");
		

	}

}
