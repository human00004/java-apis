package file_manager_api;

import file_manager_api.FileManagerException;
import java.io.IOException;
import java.io.FileWriter;

// Writes the target file and sets file append is confirm.
public abstract class WriteFile{
	// Start a file write processors.
	public void startProcessing(String fName, String text, boolean append) throws FileManagerException{
		try{
			try(FileWriter writer = new FileWriter(fName, append)){
				writer.write(text);
			}
			catch(IOException e){
				throw new FileManagerException("Error: the file is cannot be write.");
			}
		}
		catch(FileManagerException e){
			System.out.println(e);
		}
	}
}