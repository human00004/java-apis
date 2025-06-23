package file_manager_api;

import java.io.File;
import file_manager_api.FileManagerException;

// Renames the target file or directory.
public abstract class RenameFile{
	// Start a file/directory rename processors.
	public void startProcessing(String fName, String newName){
		try{
			File fRename = new File(fName);
			File targetName = new File(newName);

			if(fRename.exists()){
				if(!fRename.renameTo(targetName)){
					throw new FileManagerException("Cannot be rename the file.");
				}
			}
			else{
				throw new FileManagerException("Cannot be rename the file: File/Directory is not exist");
			}
		}
		catch(FileManagerException e){
			System.out.println(e);
		}
	}
}