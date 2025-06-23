package file_manager_api;

import java.io.BufferedReader;
import java.io.FileReader;
import file_manager_api.FileManagerException;
import java.io.IOException;

// Reads the target file and returns as string.
public abstract class ReadFile{
	// Start a file read processors.
	public String startProcessing(String fName){
		StringBuilder string = new StringBuilder();
		String line;

		try{
			try(BufferedReader fReader = new BufferedReader(new FileReader(fName))){
				while((line = fReader.readLine()) != null){
					string.append(line).append("\n");
				}
			}
			catch(IOException e){
				throw new FileManagerException("File is cannot be read: " + fName);
			}
		}
		catch(FileManagerException e){
			System.out.println(e);
		}

		return string.toString();
	}
}