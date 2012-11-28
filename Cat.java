import java.io.*;
public class Cat {
	
	public static void main(String[] args) {
		File file = new File(args[0]);
		
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
	}

	
}	