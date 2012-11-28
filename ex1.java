import java.io.File;
import java.util.Arrays;
public class Ex1 {
	
	public static void main(String[] args) {
		Ex1 script = new Ex1();
		script.launch();
	}

	public void launch() {
		File file = new File(".");
		String[] myArray;
		myArray = file.list();
		System.out.println(Arrays.toString(myArray));
		
	}	
}	