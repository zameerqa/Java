package basics;

public class TestDemo {
	
	public static void main(String[] args) {
		int rollno[]={1,2,3};
		/*System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		for(int i=0;i<3;i++){
			System.out.println(rollno[i]);
		}*/
		for(int i:rollno){
			System.out.println(i);
		}		

	}

}
