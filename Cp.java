import java.io.*;
public class Cp {

	public static void main(String[] args) {
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		String fileText = "";
		
		if (file1.exists()) {  
			
			BufferedReader in = null;  //reading of file 1 if it exists
		
			try {
				in = new BufferedReader(new FileReader(file1));
				String line;
				while ((line = in.readLine()) != null) {
					fileText = fileText + line + "\n";
				}
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
			System.out.println("This source file does NOT exist");
			return;
		}
		
		if (file2.exists()) {
			System.out.println("File 2 already exists, enter \"yes\" to overwrite it, or \"no\" to keep the original one"); 
			String answer = System.console().readLine();
			
			if (answer.equals("yes")) {	
				file2.delete();
			}
			else {
				System.out.println("Original file2 will remain unchanged");
				return;
			}				
		}
		
		try {
		file2.createNewFile();
		}
		catch (IOException ex) {
				ex.printStackTrace();
			}
		
		//writing will start now
		PrintWriter out = null;
		try {
			out = new PrintWriter(file2);
			out.write(fileText);
			}
		catch (IOException ex) {
				ex.printStackTrace();
			}
		finally {
				
						out.close();
					
			}
		
		//edw tha ginei to write ama to fileText!=null
	}
}	