package dummy;

import java_basics.Myutils;  // outside the current package

public class Example {
	public static void add(int a,int b) {
		Myutils.sum2num(a, b);
	}
	public static void mul(int a,int b) {
		System.out.println("Multiply :"+(a*b));
			}
	public static void sub(int a,int b) {
		System.out.println("sub ="+ (a-b));
			}
	public static void divide(int a ,int b) {
		System.out.println("Quationet :"+(a/b));
		System.out.println("Reminder:"+(a%b));
		
	}

}
