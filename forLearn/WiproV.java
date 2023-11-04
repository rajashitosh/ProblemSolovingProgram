package forLearn;

import java.util.*;
public class WiproV {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		
		char str=sc.next().charAt(0);
		int n=sc.nextInt();

		int z=(int)str + n;
		if(z>=122)
		{
			int d=z-122;
			System.out.println(d);
			 z=96+d;
			 System.out.println(z);
		}
		System.out.println((char)z);
	}

}
