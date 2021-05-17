package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true ;
		
		if(hungry) {
			System.out.println("Iam starving ......need some burgers");
		}else {
			System.out.println("Iam not Hungry");
		
		}

		int x =2;
		if(x%2 == 0) {  
			System.out.println("Even number");
		}else {
			System.out.println("Odd Number");
		}
		
		int currenttemp = 60;
		int favtemp = 75;
		String op ;
		
		if(currenttemp < favtemp -30) {
			op = "Darn Cold Mr.Stark.....";
		} else if(currenttemp < favtemp -20) {
			op = "Cold Mr.Stark....";
		} else if(currenttemp > favtemp+10) {
			op = "Its hot out Mr. Stark....";
		}else {
			op = "Pleasent Day Tony....";
		}
		
		System.out.println(op);
		
		
		
		int month = 6;
		String mon;
		switch(month) {
		case 1 : mon="Jan";break;
		case 2 : mon="feb";break;
		case 3 : mon ="mar";break;
		case 4: mon="apr";break;
		case 5 : mon="may"; break;
		case 6:mon="june";break;
				
		default: mon="value unkown"; break;
		}
		System.out.println(mon);
	}

}
