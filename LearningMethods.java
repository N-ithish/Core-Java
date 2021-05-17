package java_basics;

import dummy.Example;

public class LearningMethods {

	public static void main(String[] args) {
		
		System.out.println(" Invoke and prints the data given");  // Method Invoked is println
		/*System is a class and println is method*/
		
		printsomething();
		printsomething("like nothing");
		printsomething(06);
		Myutils.methodoutside(25);
		Myutils.methodoutside("method  Outside the class");
		Myutils.sum2num(1000, 23);
		int a=10;
		int sqr= Myutils.square(a);
		System.out.println("Square of 10 is " + Myutils.square(a));
	//	Myutils.printsomejunk(10)	;  // as it is a private method
		Example.add(10, 20);
		Example.mul(10, 20);
		Example.sub(20, 10);
		Example.divide(25,10);
		Myutils nonstatic ;
		nonstatic = new Myutils();
		nonstatic.nonstatic();
		nonstatic.methodoutside(10);
		
	
	}
	public static void printsomething() {
		 System.out.println("Some thing");
	}
	public static void printsomething(String x ) {
		 System.out.println("Some thing u said "+ x);
	}
	public static void printsomething(int x ) {
		 System.out.println("What number do you want to print ? "+ x);
	}
}
