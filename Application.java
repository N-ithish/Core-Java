import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		System.out.println("enter something: ");
//		Scanner input = new Scanner(System.in);
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
	
		try {
		File file =new File("myfile.txt");
	Scanner input;

		input = new Scanner(file);
	
	while (input.hasNextLine()) {
		String line = input.nextLine();
		System.out.println(line);
	}
	input.close();
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
