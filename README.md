# FILE MANAGER API
This library is builds for file manager with less details.

## API
```java
import file_manager_api.FileManagerException; // For the exception.
import file_manager_api.ReadFile; // For read the file.
import file_manager_api.DeleteFile; // For delete the file.
import file_manager_api.RenameFile; // For rename the file.
```

## Examples

### new ReadFile()
```java
ReadFile readFile = new ReadFile(){
	public String startProcessing(String fName) throws FileManagerException{
		return super.startProcessing(fName);
	}
};

try{
	System.out.println(readFile.startProcessing("C:\\example\\example.txt"));
} 
catch(FileManagerException e){
	e.printStackTrace();
}
```
### catch(FileManagerException e)
Catch the file manage errors.

### new DeleteFile()
```java
DeleteFile deleteFile = new DeleteFile(){
	@Override
	public void startProcessing(String fName) throws FileManagerException{
		super.startProcessing(fName);
	}
};

try{
	deleteFile.startProcessing("C:\\example\\example.txt");
} 
catch(FileManagerException e){
	e.printStackTrace();
}
```
### new RenameFile()
```java
RenameFile renameFile = new RenameFile(){
	@Override
	public void startProcessing(String fName, String newName) throws FileManagerException{
		super.startProcessing(fName, newName);
	}
};

try{
	renameFile.startProcessing("C:\\example\\example.txt", "C:\\example\\example2.txt");
} 
catch(FileManagerException e){
	e.printStackTrace();
}
```
### new WriteFile()
```java
WriteFile writeFile = new WriteFile(){
	@Override
	public void startProcessing(String fName, String text, boolean append) throws FileManagerException{
		super.startProcessing(fName, text, append);
	}
};

try{
	writeFile.startProcessing("C:\\example\\example.txt", "Hello world!", false);
}
catch(FileManagerException e){
	e.printStackTrace();
}
```

### Second examples

#### Extending class

##### extends ReadFile
```java
public class Main extends ReadFile{
	public String startProcessing(String fName) throws FileManagerException{
		return super.startProcessing(fName);
	}

	public static void main(String[] args) throws FileManagerException{
		Main main = new Main();

		System.out.println(main.startProcessing("C:\\example\\example.txt"));
	}
}
```
##### extends DeleteFile
```java
public class Main extends DeleteFile{
	public void startProcessing(String fName) throws FileManagerException{
		super.startProcessing(fName);
	}

	public static void main(String[] args) throws FileManagerException{
	    Main main = new Main();

		Main.startProcessing("C:\\example\\example.txt");
	}
}
```

##### extends RenameFile
```java
public class Main extends RenameFile{
	public void startProcessing(String fName, String newName) throws FileManagerException{
		super.startProcessing(fName, newName);
	}

	public static void main(String[] args) throws FileManagerException{
	    Main main = new Main();

		Main.startProcessing("C:\\example\\example.txt", "C:\\example\\example2.txt");
	}
}
```

##### extends WriteFile
```java
public class Main extends WriteFile{
	@Override
	public void startProcessing(String fName, String text, boolean append) throws FileManagerException{
		super.startProcessing(fName, text, append);
	}

	public static void main(String[] args) throws FileManagerException{
		Main example = new Main();

		example.startProcessing("C:\\example\\example.txt", "Hello world!", false);
	}
}
```

## About on this library
Type: File Manager

Version: 1.0.0.0

License: MIT

URL: https://github.com/human00004/java-apis

## Description
Why? File manage with more less details.

NOTE: The classes (outside FileManagerException class) is abstract. If the code of "new ExampleClass()" instead of "new ExampleClass(){}",
give an error.
