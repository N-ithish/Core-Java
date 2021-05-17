package java_basics;

public class Myutils {
	public static void methodoutside(String x ) {
		 System.out.println("Some thing u said "+ x);
	}
	public static void methodoutside(int x ) {
		 System.out.println("What number do you want to print from outside class ? "+ x);
	}
	
	public static void sum2num(int a ,int b) {
		int result = a+b;
		// return result ; void cannot return
		System.out.println("Result :"+result);
	}
	
	public static int square(int a) {
		int result = a*a;
		 // int , string uses return;
		return result;
	}
	private static void printsomejunke(int a) {
		System.out.println("integer passed"+a);
	}
	public void nonstatic() {
		System.out.println("A non static method cannot be called directly must be called with a instance");
	}
}

