package file_manager_api;

import java.io.File;
import file_manager_api.FileManagerException;

// Deletes a file or directory.
public abstract class DeleteFile{
	// Start a file/directory delete processors.
	public void startProcessing(String fName){
		try{
			File fDelete = new File(fName);

			if(fDelete.exists()){
				if(!fDelete.delete()){
					throw new FileManagerException("Cannot be delete the file.");
				}
			}
			else{
				throw new FileManagerException("Cannot be delete the file: File/Directory is not exist");
			}
		}
		catch(FileManagerException e){
			System.out.println(e);
		}
	}
}