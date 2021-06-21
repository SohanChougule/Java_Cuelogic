package newFileMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewFileMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("F://javaCue/", "IOExample", "testnew.txt");

	    try {
	        // Write content to file
	        Files.writeString(filePath, "Hello from Sohan!!",
	                          StandardOpenOption.APPEND);
	
	        // Verify file content
	        String content = Files.readString(filePath);
	
	        System.out.println(content);
	    }
	    catch (IOException e) {
	        e.printStackTrace();
    }
	}

}
