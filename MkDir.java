import java.io.File;
public class MkDir {
	
	public static void main(String[] args) {
		File file = new File(args[0]);
		file.mkdir();
	}

	
}	