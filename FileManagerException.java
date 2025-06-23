package file_manager_api;

// Use this exception for catch the file manage errors.
public class FileManagerException extends Exception{
	public FileManagerException(String error){
		super(error);
	}
}