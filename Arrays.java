package java_basics;

public class Arrays {

	public static void main(String[] args) {
		int v;
		v= 100;
		int [] values = new int[100];
		values[0] =0;      //first position
		values[1]= 1000;
		values[2]=2000;
		values[99]=99000; //last position
		
		System.out.println(values[99]);
		System.out.println(values[54]); //default values are 0
	//	System.out.println(values[100]); //error 
		
		String [] words = new String[] {"Hello","tony","Stark"};
		System.out.println(words[2]);
		

	}

}
