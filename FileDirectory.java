import java.io.File;
import java.util.Arrays;
public class FileDirectory {
	
	public static void main(String[] args) {
		FileDirectory script = new FileDirectory();
		script.launch();
	}

	public void launch() {
		File file = new File(".");
		String[] myArray;
		myArray = file.list();
		System.out.println(Arrays.toString(myArray));
		
	}	
}	