import java.io.*;
public class Cat {
/** I have an if else, AND an exception catch for the file not existing, one is enough
wrote both just for practise
*/
	
	public static void main(String[] args) {
		for(int i=0 ; i < args.length ; i++) {
			File file = new File(args[i]);
		
		if (file.exists()) {
			BufferedReader in = null;
			
			try {
				in = new BufferedReader(new FileReader(file));
				String line;
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}
			}
			catch (FileNotFoundException ex) {
				System.out.println("This file does NOT exist");
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
			finally {
				try {
					if (in!=null) {
						in.close();
					}
				}	
					
					catch(IOException ex) {
						ex.printStackTrace();
					}	
			
			}
				
			
		}
		
		else {
			System.out.println("This file does NOT exist");
		}
			System.out.println();
			System.out.println("End of file");
			System.out.println();
		}
	}

	
}	