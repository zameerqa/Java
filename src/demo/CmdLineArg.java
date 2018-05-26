package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineArg {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value");
		String s1=br.readLine();
		int fn=Integer.parseInt(s1);
		
		System.out.println("Enter a value");
		String s2=br.readLine();
		int fn1=Integer.parseInt(s2);
		
		System.out.println(fn+fn1);
	}

}
